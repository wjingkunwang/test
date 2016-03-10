package demo.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * 通道之间的数据传输
 */
public class TransferDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile fromFile = new RandomAccessFile("/Users/wjk/myproject/test/IO/src/main/resources/from.txt","rw");
        FileChannel fromChannel = fromFile.getChannel();
        RandomAccessFile toFile = new RandomAccessFile("/Users/wjk/myproject/test/IO/src/main/resources/to.txt","rw");
        FileChannel toChannel = toFile.getChannel();

        long position = 0;
        long count = fromChannel.size();

        toChannel.transferFrom(fromChannel,position,count);
    }
}
