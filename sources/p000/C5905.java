package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦؘُۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5905 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Method f19462;

    /* JADX INFO: renamed from: ۥَ */
    public String f19463;

    /* JADX INFO: renamed from: ۥُ */
    public final Annotation[][] f19464;

    /* JADX INFO: renamed from: ۥّ */
    public final Type[] f19465;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f19466;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f19467;

    /* JADX INFO: renamed from: ۥٖ */
    public C4714 f19468;

    /* JADX INFO: renamed from: ۥۖ */
    public AbstractC4489[] f19469;

    /* JADX INFO: renamed from: ۥۗ */
    public final Class f19470;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f19471;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1414 f19472;

    /* JADX INFO: renamed from: ۦؑ */
    public final Annotation[] f19473;

    /* JADX INFO: renamed from: ۦؚ */
    public boolean f19474;

    /* JADX INFO: renamed from: ۦٌ */
    public boolean f19475;

    /* JADX INFO: renamed from: ۦِ */
    public boolean f19476;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f19477;

    /* JADX INFO: renamed from: ۦٗ */
    public C0822 f19478;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f19479;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f19480;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f19481;

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f19482;

    /* JADX INFO: renamed from: ۦۛ */
    public LinkedHashSet f19483;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f19484;

    /* JADX INFO: renamed from: ۦۨ */
    public String f19485;

    /* JADX INFO: renamed from: ۥٙ */
    public static final Pattern f19461 = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: ۥؖ */
    public static final Pattern f19460 = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    public C5905(C1414 c1414, Class cls, Method method) {
        this.f19472 = c1414;
        this.f19470 = cls;
        this.f19462 = method;
        this.f19473 = method.getAnnotations();
        this.f19465 = method.getGenericParameterTypes();
        this.f19464 = method.getParameterAnnotations();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Class m9732(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9733(int i, Type type) {
        if (AbstractC4554.m7903(type)) {
            throw AbstractC4554.m7926(this.f19462, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9734(String str, String str2, boolean z) {
        String str3 = this.f19485;
        Method method = this.f19462;
        if (str3 != null) {
            throw AbstractC4554.m7923(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f19485 = str;
        this.f19484 = z;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f19461;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw AbstractC4554.m7923(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f19463 = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f19483 = linkedHashSet;
    }
}
