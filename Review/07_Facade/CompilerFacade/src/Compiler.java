public class Compiler {
    private Parser paerser;
    private Assembler assembler;
    private Linker linker;

    public void compile(String sourceFile) {
        this.paerser = new Parser();
        this.linker = new Linker();
        this.assembler = new Assembler();
        paerser.parse(sourceFile);
        compileInternal(sourceFile);
        assembler.assemble(sourceFile);
        linker.link(sourceFile);
    }

    public void compileInternal(String sourceFile){
        System.out.println(sourceFile + " ist internal compilt");
    }
}
