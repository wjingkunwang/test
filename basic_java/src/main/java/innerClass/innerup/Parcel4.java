package innerClass.innerup;

/**
 * private内部类给设计者提供一种途径,通过方式可以组织依赖于类型的编码,并且完全隐藏了实现的细节.此外对于客户端程序员的角度看,由于不能访问
 * 任何新增的,原本不属于公共接口的方法,所以扩展接口是没有价值的.这也给java编译器提供了生成更高效代码的机会.
 */
public class Parcel4 {
    private class PContents implements Contents{
        private int i = 11;
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;

        public PDestination(String whereTO) {
            this.label = whereTO;
        }

        public String readLabel() {
            return null;
        }
    }

    //PDestination protected修饰
    public Destination destination(String s){
        return  new PDestination(s);
    }
    //报错 PContents private修饰
    /*public Contents contents{
        return new PContents();
    }*/
}
