package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦ۠ؑۨٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5376 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC2003 f17753;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2561 f17754;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4828 f17755;

    public AbstractC5376(C4828 c4828, C2561 c2561, InterfaceC2003 interfaceC2003) {
        this.f17755 = c4828;
        this.f17754 = c2561;
        this.f17753 = interfaceC2003;
    }

    /* JADX WARN: Code duplicated, block: B:386:0x08e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:589:0x08ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x08ea A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۥۗ */
    public static AbstractC5376 m9031(C1414 c1414, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC4489 abstractC4489;
        int i;
        AbstractC4489[] abstractC4489Arr;
        int i2;
        int i3;
        AbstractC4489 c1124;
        AbstractC4489 c3791;
        C1124 c1125;
        C5905 c5905 = new C5905(c1414, cls, method);
        Annotation[] annotationArr = c5905.f19473;
        int length = annotationArr.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            AbstractC4489 abstractC44810 = null;
            if (i5 >= length) {
                if (c5905.f19485 == null) {
                    throw AbstractC4554.m7923(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!c5905.f19484) {
                    if (c5905.f19467) {
                        throw AbstractC4554.m7923(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (c5905.f19466) {
                        throw AbstractC4554.m7923(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = c5905.f19464;
                int length2 = annotationArr2.length;
                c5905.f19469 = new AbstractC4489[length2];
                int i6 = length2 - 1;
                int i7 = 0;
                while (i7 < length2) {
                    AbstractC4489[] abstractC4489Arr2 = c5905.f19469;
                    Type type = c5905.f19465[i7];
                    Annotation[] annotationArr3 = annotationArr2[i7];
                    int i8 = i7 == i6 ? 1 : i4;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        abstractC4489 = abstractC44810;
                        int i9 = i4;
                        while (i9 < length3) {
                            Annotation annotation = annotationArr3[i9];
                            Annotation[][] annotationArr4 = annotationArr2;
                            AbstractC4489 c0444 = C3284.f11004;
                            int i10 = length2;
                            int i11 = i6;
                            if (annotation instanceof InterfaceC3358) {
                                c5905.m9733(i7, type);
                                if (c5905.f19482) {
                                    throw AbstractC4554.m7926(method, i7, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (c5905.f19476) {
                                    throw AbstractC4554.m7926(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (c5905.f19480) {
                                    throw AbstractC4554.m7926(method, i7, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (c5905.f19474) {
                                    throw AbstractC4554.m7926(method, i7, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (c5905.f19475) {
                                    throw AbstractC4554.m7926(method, i7, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (c5905.f19463 != null) {
                                    throw AbstractC4554.m7926(method, i7, "@Url cannot be used with @%s URL", c5905.f19485);
                                }
                                c5905.f19482 = true;
                                if (type != C0774.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw AbstractC4554.m7926(method, i7, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                c1124 = new C5897(method, i7, 1);
                                i = i9;
                            } else {
                                i = i9;
                                boolean z5 = annotation instanceof InterfaceC4403;
                                C1414 c1415 = c5905.f19472;
                                if (z5) {
                                    c5905.m9733(i7, type);
                                    if (c5905.f19480) {
                                        throw AbstractC4554.m7926(method, i7, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (c5905.f19474) {
                                        throw AbstractC4554.m7926(method, i7, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (c5905.f19475) {
                                        throw AbstractC4554.m7926(method, i7, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (c5905.f19482) {
                                        throw AbstractC4554.m7926(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (c5905.f19463 == null) {
                                        throw AbstractC4554.m7926(method, i7, "@Path can only be used with relative url on @%s", c5905.f19485);
                                    }
                                    c5905.f19476 = true;
                                    InterfaceC4403 interfaceC4403 = (InterfaceC4403) annotation;
                                    String strValue = interfaceC4403.value();
                                    if (!C5905.f19460.matcher(strValue).matches()) {
                                        throw AbstractC4554.m7926(method, i7, "@Path parameter name must match %s. Found: %s", C5905.f19461.pattern(), strValue);
                                    }
                                    if (!c5905.f19483.contains(strValue)) {
                                        throw AbstractC4554.m7926(method, i7, "URL \"%s\" does not contain \"{%s}\".", c5905.f19463, strValue);
                                    }
                                    c1415.m3000(type, annotationArr3);
                                    c1124 = new C4099(c5905.f19462, i7, strValue, interfaceC4403.encoded());
                                } else {
                                    abstractC4489Arr = abstractC4489Arr2;
                                    i2 = i8;
                                    if (annotation instanceof InterfaceC4486) {
                                        c5905.m9733(i7, type);
                                        InterfaceC4486 interfaceC4486 = (InterfaceC4486) annotation;
                                        String strValue2 = interfaceC4486.value();
                                        boolean zEncoded = interfaceC4486.encoded();
                                        Class clsM7897 = AbstractC4554.m7897(type);
                                        i3 = length3;
                                        c5905.f19480 = true;
                                        if (!Iterable.class.isAssignableFrom(clsM7897)) {
                                            if (clsM7897.isArray()) {
                                                c1415.m3000(C5905.m9732(clsM7897.getComponentType()), annotationArr3);
                                                c1125 = new C1124(new C5010(2, strValue2, zEncoded), 1);
                                            } else {
                                                c1415.m3000(type, annotationArr3);
                                                c1124 = new C5010(2, strValue2, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw AbstractC4554.m7926(method, i7, clsM7897.getSimpleName() + " must include generic type (e.g., " + clsM7897.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c1415.m3000(AbstractC4554.m7925(0, (ParameterizedType) type), annotationArr3);
                                            c1125 = new C1124(new C5010(2, strValue2, zEncoded), 0);
                                        }
                                        c1124 = c1125;
                                        str = str;
                                    } else {
                                        i3 = length3;
                                        if (annotation instanceof InterfaceC0494) {
                                            c5905.m9733(i7, type);
                                            boolean zEncoded2 = ((InterfaceC0494) annotation).encoded();
                                            Class clsM7898 = AbstractC4554.m7897(type);
                                            c5905.f19474 = true;
                                            if (!Iterable.class.isAssignableFrom(clsM7898)) {
                                                if (clsM7898.isArray()) {
                                                    c1415.m3000(C5905.m9732(clsM7898.getComponentType()), annotationArr3);
                                                    c1125 = new C1124(new C2300(zEncoded2), 1);
                                                } else {
                                                    c1415.m3000(type, annotationArr3);
                                                    c1124 = new C2300(zEncoded2);
                                                }
                                                str = str;
                                            } else {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw AbstractC4554.m7926(method, i7, clsM7898.getSimpleName() + " must include generic type (e.g., " + clsM7898.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c1415.m3000(AbstractC4554.m7925(0, (ParameterizedType) type), annotationArr3);
                                                c1125 = new C1124(new C2300(zEncoded2), 0);
                                            }
                                            c1124 = c1125;
                                            str = str;
                                        } else {
                                            str = str;
                                            if (annotation instanceof InterfaceC0456) {
                                                c5905.m9733(i7, type);
                                                Class clsM7899 = AbstractC4554.m7897(type);
                                                c5905.f19475 = true;
                                                if (!Map.class.isAssignableFrom(clsM7899)) {
                                                    throw AbstractC4554.m7926(method, i7, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM7883 = AbstractC4554.m7883(type, clsM7899);
                                                if (!(typeM7883 instanceof ParameterizedType)) {
                                                    throw AbstractC4554.m7926(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeM7883;
                                                Type typeM7925 = AbstractC4554.m7925(0, parameterizedType);
                                                if (String.class != typeM7925) {
                                                    throw AbstractC4554.m7926(method, i7, "@QueryMap keys must be of type String: " + typeM7925, new Object[0]);
                                                }
                                                c1415.m3000(AbstractC4554.m7925(1, parameterizedType), annotationArr3);
                                                c0444 = new C5174(method, i7, ((InterfaceC0456) annotation).encoded(), 2);
                                            } else if (annotation instanceof InterfaceC2131) {
                                                c5905.m9733(i7, type);
                                                InterfaceC2131 interfaceC2131 = (InterfaceC2131) annotation;
                                                String strValue3 = interfaceC2131.value();
                                                Class clsM78910 = AbstractC4554.m7897(type);
                                                if (Iterable.class.isAssignableFrom(clsM78910)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC4554.m7926(method, i7, clsM78910.getSimpleName() + " must include generic type (e.g., " + clsM78910.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c1415.m3000(AbstractC4554.m7925(0, (ParameterizedType) type), annotationArr3);
                                                    c1124 = new C1124(new C5010(1, strValue3, interfaceC2131.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsM78910.isArray()) {
                                                    c1415.m3000(C5905.m9732(clsM78910.getComponentType()), annotationArr3);
                                                    c1124 = new C1124(new C5010(1, strValue3, interfaceC2131.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    c1415.m3000(type, annotationArr3);
                                                    c0444 = new C5010(1, strValue3, interfaceC2131.allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof InterfaceC1722) {
                                                if (type == C4714.class) {
                                                    c1124 = new C5897(method, i7, 0);
                                                } else {
                                                    c5905.m9733(i7, type);
                                                    Class clsM78911 = AbstractC4554.m7897(type);
                                                    if (!Map.class.isAssignableFrom(clsM78911)) {
                                                        throw AbstractC4554.m7926(method, i7, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeM7884 = AbstractC4554.m7883(type, clsM78911);
                                                    if (!(typeM7884 instanceof ParameterizedType)) {
                                                        throw AbstractC4554.m7926(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM7884;
                                                    Type typeM7926 = AbstractC4554.m7925(0, parameterizedType2);
                                                    if (String.class != typeM7926) {
                                                        throw AbstractC4554.m7926(method, i7, "@HeaderMap keys must be of type String: " + typeM7926, new Object[0]);
                                                    }
                                                    c1415.m3000(AbstractC4554.m7925(1, parameterizedType2), annotationArr3);
                                                    c1124 = new C5174(method, i7, ((InterfaceC1722) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof InterfaceC2799) {
                                                c5905.m9733(i7, type);
                                                if (!c5905.f19466) {
                                                    throw AbstractC4554.m7926(method, i7, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                InterfaceC2799 interfaceC2799 = (InterfaceC2799) annotation;
                                                String strValue4 = interfaceC2799.value();
                                                boolean zEncoded3 = interfaceC2799.encoded();
                                                c5905.f19481 = true;
                                                Class clsM78912 = AbstractC4554.m7897(type);
                                                if (Iterable.class.isAssignableFrom(clsM78912)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC4554.m7926(method, i7, clsM78912.getSimpleName() + " must include generic type (e.g., " + clsM78912.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c1415.m3000(AbstractC4554.m7925(0, (ParameterizedType) type), annotationArr3);
                                                    c1124 = new C1124(new C5010(0, strValue4, zEncoded3), 0);
                                                } else if (clsM78912.isArray()) {
                                                    c1415.m3000(C5905.m9732(clsM78912.getComponentType()), annotationArr3);
                                                    c1124 = new C1124(new C5010(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    c1415.m3000(type, annotationArr3);
                                                    c3791 = new C5010(0, strValue4, zEncoded3);
                                                    c1124 = c3791;
                                                }
                                            } else if (annotation instanceof InterfaceC2691) {
                                                c5905.m9733(i7, type);
                                                if (!c5905.f19466) {
                                                    throw AbstractC4554.m7926(method, i7, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsM78913 = AbstractC4554.m7897(type);
                                                if (!Map.class.isAssignableFrom(clsM78913)) {
                                                    throw AbstractC4554.m7926(method, i7, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM7885 = AbstractC4554.m7883(type, clsM78913);
                                                if (!(typeM7885 instanceof ParameterizedType)) {
                                                    throw AbstractC4554.m7926(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM7885;
                                                int i12 = 0;
                                                Type typeM7927 = AbstractC4554.m7925(0, parameterizedType3);
                                                if (String.class != typeM7927) {
                                                    throw AbstractC4554.m7926(method, i7, "@FieldMap keys must be of type String: " + typeM7927, new Object[0]);
                                                }
                                                c1415.m3000(AbstractC4554.m7925(1, parameterizedType3), annotationArr3);
                                                c5905.f19481 = true;
                                                c1124 = new C5174(method, i7, ((InterfaceC2691) annotation).encoded(), i12);
                                            } else if (annotation instanceof InterfaceC5674) {
                                                c5905.m9733(i7, type);
                                                if (!c5905.f19467) {
                                                    throw AbstractC4554.m7926(method, i7, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                InterfaceC5674 interfaceC5674 = (InterfaceC5674) annotation;
                                                c5905.f19471 = true;
                                                String strValue5 = interfaceC5674.value();
                                                Class clsM78914 = AbstractC4554.m7897(type);
                                                if (!strValue5.isEmpty()) {
                                                    C4714 c4714M7469 = AbstractC4225.m7469("Content-Disposition", AbstractC3761.m6629("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", interfaceC5674.encoding());
                                                    if (Iterable.class.isAssignableFrom(clsM78914)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw AbstractC4554.m7926(method, i7, clsM78914.getSimpleName() + " must include generic type (e.g., " + clsM78914.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeM7928 = AbstractC4554.m7925(0, (ParameterizedType) type);
                                                        if (C3394.class.isAssignableFrom(AbstractC4554.m7897(typeM7928))) {
                                                            throw AbstractC4554.m7926(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c1124 = new C1124(new C3791(method, i7, c4714M7469, c1415.m2996(typeM7928, annotationArr3, annotationArr)), 0);
                                                    } else if (clsM78914.isArray()) {
                                                        Class clsM9732 = C5905.m9732(clsM78914.getComponentType());
                                                        if (C3394.class.isAssignableFrom(clsM9732)) {
                                                            throw AbstractC4554.m7926(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c1124 = new C1124(new C3791(method, i7, c4714M7469, c1415.m2996(clsM9732, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (C3394.class.isAssignableFrom(clsM78914)) {
                                                            throw AbstractC4554.m7926(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c3791 = new C3791(method, i7, c4714M7469, c1415.m2996(type, annotationArr3, annotationArr));
                                                        c1124 = c3791;
                                                    }
                                                } else if (Iterable.class.isAssignableFrom(clsM78914)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC4554.m7926(method, i7, clsM78914.getSimpleName() + " must include generic type (e.g., " + clsM78914.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    if (!C3394.class.isAssignableFrom(AbstractC4554.m7897(AbstractC4554.m7925(0, (ParameterizedType) type)))) {
                                                        throw AbstractC4554.m7926(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    c1124 = new C1124(c0444, 0);
                                                } else if (clsM78914.isArray()) {
                                                    if (!C3394.class.isAssignableFrom(clsM78914.getComponentType())) {
                                                        throw AbstractC4554.m7926(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    c1124 = new C1124(c0444, 1);
                                                } else if (!C3394.class.isAssignableFrom(clsM78914)) {
                                                    throw AbstractC4554.m7926(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else if (annotation instanceof InterfaceC4735) {
                                                c5905.m9733(i7, type);
                                                if (!c5905.f19467) {
                                                    throw AbstractC4554.m7926(method, i7, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                c5905.f19471 = true;
                                                Class clsM78915 = AbstractC4554.m7897(type);
                                                if (!Map.class.isAssignableFrom(clsM78915)) {
                                                    throw AbstractC4554.m7926(method, i7, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM7886 = AbstractC4554.m7883(type, clsM78915);
                                                if (!(typeM7886 instanceof ParameterizedType)) {
                                                    throw AbstractC4554.m7926(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeM7886;
                                                Type typeM7929 = AbstractC4554.m7925(0, parameterizedType4);
                                                if (String.class != typeM7929) {
                                                    throw AbstractC4554.m7926(method, i7, "@PartMap keys must be of type String: " + typeM7929, new Object[0]);
                                                }
                                                Type typeM79210 = AbstractC4554.m7925(1, parameterizedType4);
                                                if (C3394.class.isAssignableFrom(AbstractC4554.m7897(typeM79210))) {
                                                    throw AbstractC4554.m7926(method, i7, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                c0444 = new C3791(method, i7, c1415.m2996(typeM79210, annotationArr3, annotationArr), ((InterfaceC4735) annotation).encoding());
                                            } else if (annotation instanceof InterfaceC1582) {
                                                c5905.m9733(i7, type);
                                                if (c5905.f19466 || c5905.f19467) {
                                                    throw AbstractC4554.m7926(method, i7, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (c5905.f19479) {
                                                    throw AbstractC4554.m7926(method, i7, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    InterfaceC2003 interfaceC2003M2996 = c1415.m2996(type, annotationArr3, annotationArr);
                                                    c5905.f19479 = true;
                                                    c0444 = new C2192(method, i7, interfaceC2003M2996);
                                                } catch (RuntimeException e) {
                                                    throw AbstractC4554.m7882(method, e, i7, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof InterfaceC3715) {
                                                c5905.m9733(i7, type);
                                                Class clsM9733 = C5905.m9732(AbstractC4554.m7897(type));
                                                for (int i13 = i7 - 1; i13 >= 0; i13--) {
                                                    AbstractC4489 abstractC44811 = c5905.f19469[i13];
                                                    if ((abstractC44811 instanceof C0444) && ((C0444) abstractC44811).f1631.equals(clsM9733)) {
                                                        throw AbstractC4554.m7926(method, i7, "@Tag type " + clsM9733.getName() + " is duplicate of " + AbstractC4057.f13517.mo8219(method, i13) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                c0444 = new C0444(clsM9733);
                                            } else {
                                                c1124 = null;
                                            }
                                            c1124 = c0444;
                                        }
                                    }
                                }
                                if (c1124 != null) {
                                    if (abstractC4489 == null) {
                                        throw AbstractC4554.m7926(method, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    abstractC4489 = c1124;
                                }
                                i9 = i + 1;
                                annotationArr2 = annotationArr4;
                                length2 = i10;
                                i6 = i11;
                                length3 = i3;
                                abstractC4489Arr2 = abstractC4489Arr;
                                i8 = i2;
                                str = str;
                            }
                            abstractC4489Arr = abstractC4489Arr2;
                            i2 = i8;
                            i3 = length3;
                            if (c1124 != null) {
                                if (abstractC4489 == null) {
                                    throw AbstractC4554.m7926(method, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                abstractC4489 = c1124;
                            }
                            i9 = i + 1;
                            annotationArr2 = annotationArr4;
                            length2 = i10;
                            i6 = i11;
                            length3 = i3;
                            abstractC4489Arr2 = abstractC4489Arr;
                            i8 = i2;
                            str = str;
                        }
                    } else {
                        abstractC4489 = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i14 = length2;
                    String str2 = str;
                    int i15 = i6;
                    AbstractC4489[] abstractC4489Arr3 = abstractC4489Arr2;
                    int i16 = i8;
                    if (abstractC4489 == null) {
                        if (i16 != 0) {
                            try {
                                if (AbstractC4554.m7897(type) == InterfaceC0443.class) {
                                    c5905.f19477 = true;
                                    abstractC4489 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw AbstractC4554.m7926(method, i7, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC4489Arr3[i7] = abstractC4489;
                    i7++;
                    annotationArr2 = annotationArr5;
                    length2 = i14;
                    i6 = i15;
                    str = str2;
                    i4 = 0;
                    abstractC44810 = null;
                }
                String str3 = str;
                if (c5905.f19463 == null && !c5905.f19482) {
                    throw AbstractC4554.m7923(method, null, "Missing either @%s URL or @Url parameter.", c5905.f19485);
                }
                boolean z6 = c5905.f19466;
                if (!z6 && !c5905.f19467 && !c5905.f19484 && c5905.f19479) {
                    throw AbstractC4554.m7923(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !c5905.f19481) {
                    throw AbstractC4554.m7923(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (c5905.f19467 && !c5905.f19471) {
                    throw AbstractC4554.m7923(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C4828 c4828 = new C4828(c5905);
                Type genericReturnType2 = method.getGenericReturnType();
                if (AbstractC4554.m7903(genericReturnType2)) {
                    throw AbstractC4554.m7923(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw AbstractC4554.m7923(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = c4828.f15900;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeM79211 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeM79211 instanceof WildcardType) {
                        typeM79211 = ((WildcardType) typeM79211).getLowerBounds()[0];
                    }
                    if (AbstractC4554.m7897(typeM79211) == C4633.class && (typeM79211 instanceof ParameterizedType)) {
                        typeM79211 = AbstractC4554.m7925(0, (ParameterizedType) typeM79211);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (AbstractC4554.m7897(typeM79211) == InterfaceC5065.class) {
                            throw AbstractC4554.m7923(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", AbstractC4554.m7925(0, (ParameterizedType) typeM79211));
                        }
                        z3 = AbstractC4554.f15046 && typeM79211 == C2358.class;
                        z2 = false;
                    }
                    genericReturnType = new C3549(null, InterfaceC5065.class, typeM79211);
                    if (!AbstractC4554.m7920(annotations, InterfaceC3217.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = C0732.f2669;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    InterfaceC2387 interfaceC2387M3004 = c1414.m3004(genericReturnType, annotations);
                    Type typeMo4465 = interfaceC2387M3004.mo4465();
                    if (typeMo4465 == C2147.class) {
                        throw AbstractC4554.m7923(method, null, "'" + AbstractC4554.m7897(typeMo4465).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeMo4465 == C4633.class) {
                        throw AbstractC4554.m7923(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c4828.f15899.equals(str3) && !Void.class.equals(typeMo4465) && (!AbstractC4554.f15046 || typeMo4465 != C2358.class)) {
                        throw AbstractC4554.m7923(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC2003 interfaceC2003M3005 = c1414.m3005(typeMo4465, method.getAnnotations());
                        C2561 c2561 = (C2561) c1414.f4868;
                        if (z7) {
                            return z2 ? new C5012(c4828, c2561, interfaceC2003M3005, interfaceC2387M3004, 1) : new C4537(c4828, c2561, interfaceC2003M3005, interfaceC2387M3004, z);
                        }
                        return new C5012(c4828, c2561, interfaceC2003M3005, interfaceC2387M3004, 0);
                    } catch (RuntimeException e2) {
                        throw AbstractC4554.m7923(method, e2, "Unable to create converter for %s", typeMo4465);
                    }
                } catch (RuntimeException e3) {
                    throw AbstractC4554.m7923(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i5];
            if (annotation2 instanceof InterfaceC0623) {
                c5905.m9734("DELETE", ((InterfaceC0623) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC2371) {
                c5905.m9734("GET", ((InterfaceC2371) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC5417) {
                c5905.m9734("HEAD", ((InterfaceC5417) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC2836) {
                c5905.m9734("PATCH", ((InterfaceC2836) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC2957) {
                c5905.m9734("POST", ((InterfaceC2957) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC5261) {
                c5905.m9734("PUT", ((InterfaceC5261) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC5533) {
                c5905.m9734("OPTIONS", ((InterfaceC5533) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC1698) {
                InterfaceC1698 interfaceC1698 = (InterfaceC1698) annotation2;
                c5905.m9734(interfaceC1698.method(), interfaceC1698.path(), interfaceC1698.hasBody());
            } else if (annotation2 instanceof InterfaceC0860) {
                InterfaceC0860 interfaceC0860 = (InterfaceC0860) annotation2;
                String[] strArrValue = interfaceC0860.value();
                if (strArrValue.length == 0) {
                    throw AbstractC4554.m7923(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = interfaceC0860.allowUnsafeNonAsciiValues();
                C5086 c5086 = new C5086(24);
                int length4 = strArrValue.length;
                int i17 = 0;
                while (i17 < length4) {
                    String str4 = strArrValue[i17];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw AbstractC4554.m7923(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            Pattern pattern = C0822.f2914;
                            c5905.f19478 = AbstractC5378.m9040(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw AbstractC4554.m7923(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        c5086.m8692(strSubstring, strTrim);
                    } else {
                        c5086.m8691(strSubstring, strTrim);
                    }
                    i17++;
                    z4 = z8;
                }
                c5905.f19468 = c5086.m8701();
            } else if (annotation2 instanceof InterfaceC5681) {
                if (c5905.f19466) {
                    throw AbstractC4554.m7923(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c5905.f19467 = true;
            } else if (!(annotation2 instanceof InterfaceC5204)) {
                continue;
            } else {
                if (c5905.f19467) {
                    throw AbstractC4554.m7923(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c5905.f19466 = true;
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract Object mo7864(C0724 c0724, Object[] objArr);
}
