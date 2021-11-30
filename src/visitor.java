import antlr.minisysyBaseVisitor;
import antlr.minisysyParser;

public class visitor extends minisysyBaseVisitor<Void>{
    @Override
    public Void visitComunit(antlr.minisysyParser.ComunitContext ctx) {
        return super.visitComunit(ctx);
    }

    @Override
    public Void visitFuncdef(antlr.minisysyParser.FuncdefContext ctx) {
        //main.printf("define dso_local i32 @main()");
        System.out.print("define dso_local i32 @main()");
        visit(ctx.block());
        return null;
    }

    @Override
    public Void visitBlock(minisysyParser.BlockContext ctx) {
        //main.printf("{\n");
        System.out.println('{');
        visit(ctx.stmt());
        //main.printf("}\n");
        System.out.println('}');
        return null;
    }

    @Override
    public Void visitStmt(minisysyParser.StmtContext ctx) {
        //main.printf("ret i32 ");
        System.out.print("ret i32 ");
        String num=ctx.NUMBER().toString();
        int sum=0;
        int lenth=num.length();
        if(num.charAt(0)=='0'){
            if(num.length()==1||(num.charAt(1)!='x'&&num.charAt(1)!='X')){//八进制
                int i=1;
                while(i<=lenth-1){
                    sum=sum*8;
                    sum+=num.charAt(i)-'0';
                    i++;
                }
            }
            else {//十六进制
                int i=2;
                while(i<=lenth-1){
                    sum=sum*16;
                    char add = num.charAt(i);
                    if(add>='0'&&add<='9'){
                        sum+=add-'0';
                    }
                    else if(add>='a'&&add<='f'){
                        sum+=add-'a'+10;
                    }
                    else if(add>='A'&&add<='F'){
                        sum+=add-'A'+10;
                    }
                    i++;
                }

            }
        }
        else {//十进制
            int i=0;
            while (i<=lenth-1){
                sum=sum*10;
                sum+=num.charAt(i)-'0';
                i++;
            }
        }
        //main.printf(String.valueOf(sum));
        System.out.println(sum);
        return null;
    }
}
