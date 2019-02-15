package dependencies;

import org.apache.commons.lang3.StringUtils;


public class NameVerier {
    public static void main(String[] args) throws java.lang.IllegalStateException {
        String name = "Maciek";
        System.out.println(StringUtils.isAlpha(name));

    } }