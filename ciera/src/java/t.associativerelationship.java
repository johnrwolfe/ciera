T_b("package ");
T_b(package);
T_b(";");
T_b("\n");
T_b(imports);
T_b("\n");
T_b("public class ");
T_b(name);
T_b(" extends ");
T_b(extends);
T_b(" {");
T_b("\n");
T_b("    ");
T_b("// one class");
T_b("\n");
T_b("    ");
T_b("private UniqueId ");
if ( 0!=strcmp("",one_phrase) ) {
T_b(T_l(T_underscore(one_phrase)));
T_b("_");
}
T_b(one_class_name);
T_b(";");
T_b("\n");
T_b("    ");
T_b("// other class");
T_b("\n");
T_b("    ");
T_b("private UniqueId ");
if ( 0!=strcmp("",other_phrase) ) {
T_b(T_l(T_underscore(other_phrase)));
T_b("_");
}
T_b(other_class_name);
T_b(";");
T_b("\n");
T_b("    ");
T_b("// link class");
T_b("\n");
T_b("    ");
T_b("private UniqueId ");
T_b(link_class_name);
T_b(";");
T_b("\n");
T_b("}");
T_b("\n");
