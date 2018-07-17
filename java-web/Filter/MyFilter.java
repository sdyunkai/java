public class MyFilter implements Filter {
    public void init(FilterConfig config) {
        System.out.println("---filter init---");
    }

    public void doFilter(ServletRequest req, ServletResponse res, FIlterChain chain) {
        System.out.println("--do before service");
        chain.doFilter(req, res);
        System.out.println("--do after service");

    }

    public void destroy() {
        System.out.println("---filter destroy---");
    }
}