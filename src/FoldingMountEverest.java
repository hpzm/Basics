public class FoldingMountEverest {
    public static void main(String[] args) {
        int count=0;
        double paper=0.1;
        int mountZhuMuLangMa=8844430;
        while (paper<=mountZhuMuLangMa){
            paper *=2;
            count++;
            System.out.println("第"+count+"次折叠的高度为"+paper+"mm");
        }
        System.out.println("折叠次数为："+count);
    }
}
