package demo.io;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Java NIO的通道类似流  channel
 *
 * 既可以从通道读取数据,也可以写数据到通道,当时流的读写是单向的
 * 通道可以异步读
 * 通道中的数据总是要先读到一个Buffer,或者总是要从一个Buffer中写入
 */
public class ChannelDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile aFile = new RandomAccessFile("/Users/wjk/myproject/test/IO/src/main/resources/io.txt", "rw");
        //获取接水工
        FileChannel channel = aFile.getChannel();
        //设置水桶的大小
        ByteBuffer buffer = ByteBuffer.allocate(43);
        //节水工用水桶接水
        int bytesRead = channel.read(buffer);

        if (bytesRead != -1) {
            System.out.println("read: " + bytesRead);
            //接水工准备倒出水桶里的水(可以倒出刚才接的水)
            buffer.flip();
            //水桶是否还有水
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            //倒掉剩余的水
            //compact(将剩余的水留在水桶中)
            buffer.clear();
            bytesRead = channel.read(buffer);
        }
        aFile.close();
    }
}
