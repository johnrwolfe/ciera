if ( 0!=strcmp("",oal) ) {
T_b(indent);
T_b("// ");
T_b(oal);
T_b("\n");
}
T_b(indent);
T_b(expression_body);
T_b(";");
T_b("\n");
