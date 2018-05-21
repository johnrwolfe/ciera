T_b("package ");
T_b(self->package);
T_b(".impl;");
T_b("\n");
T_b(imports);
T_b("\n");
T_b("public class ");
T_b(self->name);
T_b("Impl extends ");
T_b(self->extends);
T_b(" implements ");
T_b(self->name);
T_b(" {");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("    ");
T_b("public static final String KEY_LETTERS = \"");
T_b(self->key_letters);
T_b("\";");
T_b("\n");
T_b("    ");
T_b("public static final ");
T_b(self->name);
T_b(" EMPTY_");
T_b(T_underscore(T_u(self->name)));
T_b(" = new Empty");
T_b(self->name);
T_b("();");
T_b("\n");
T_b("    ");
T_b("private ");
T_b(self->comp_name);
T_b(" context;");
T_b("\n");
T_b("    ");
T_b("// constructor");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(self->name);
T_b("Impl( ");
T_b(self->comp_name);
T_b(" context ) {");
T_b("\n");
T_b("        ");
T_b("this.context = context;");
T_b("\n");
T_b(attribute_initializers);
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("public static ");
T_b(self->name);
T_b(" create( ");
T_b(self->comp_name);
T_b(" context ) throws XtumlException {");
T_b("\n");
T_b("        ");
T_b(self->name);
T_b(" new");
T_b(self->name);
T_b(" = new ");
T_b(self->name);
T_b("Impl( context );");
T_b("\n");
T_b("        ");
T_b("if ( context.addInstance( new");
T_b(self->name);
T_b(" ) ) return new");
T_b(self->name);
T_b(";");
T_b("\n");
T_b("        ");
T_b("else throw new InstancePopulationException( \"Instance already exists within this population.\" );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("    ");
T_b("// attributes");
T_b("\n");
T_b(attributes);
T_b("\n");
T_b("    ");
T_b("// operations");
T_b("\n");
T_b(operations);
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("    ");
T_b("// selections");
T_b("\n");
T_b(selectors);
T_b("\n");
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public IRunContext getRunContext() {");
T_b("\n");
T_b("        ");
T_b("return population().getRunContext();");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(self->comp_name);
T_b(" population() {");
T_b("\n");
T_b("        ");
T_b("return context;");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public String getKeyLetters() {");
T_b("\n");
T_b("        ");
T_b("return KEY_LETTERS;");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("}");
T_b("\n");
T_b("class Empty");
T_b(self->name);
T_b(" extends ");
T_b(self->name);
T_b("Impl implements IEmptyInstance {");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("    ");
T_b("public Empty");
T_b(self->name);
T_b("() {");
T_b("\n");
T_b("        ");
T_b("super( null );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("// selections");
T_b("\n");
T_b(empty_selectors);
T_b("\n");
T_b("}");
T_b("\n");