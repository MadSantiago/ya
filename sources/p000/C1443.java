package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import de.robv.android.xposed.XSharedPreferences;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: ۥٖٜؒٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1443 {

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean f4940;

    /* JADX INFO: renamed from: ۥّ */
    public static final LinkedHashMap f4941;

    /* JADX INFO: renamed from: ۦۙ */
    public static final LinkedHashMap f4942;

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f4943;

    /* JADX INFO: renamed from: ۥۗ */
    public String f4944;

    /* JADX INFO: renamed from: ۥۣ */
    public Context f4945;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f4946;

    static {
        boolean z = C0113.f449;
        f4940 = C0113.m208();
        f4941 = new LinkedHashMap();
        f4942 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final SharedPreferences m3067() {
        Object c4535;
        LinkedHashMap linkedHashMap = f4942;
        if (f4940 && AbstractC0684.m1534(C0113.f448)) {
            C1078.m2276("Xposed modulePackageName load failed, please reset and rebuild it");
            return null;
        }
        try {
            c4535 = (SharedPreferences) linkedHashMap.get(this.f4945 + m3070());
            if (c4535 == null) {
                Context context = this.f4945;
                if (context == null || (c4535 = context.getSharedPreferences(m3070(), 1)) == null) {
                    c4535 = null;
                } else {
                    this.f4943 = true;
                    linkedHashMap.put(this.f4945 + m3070(), c4535);
                }
                if (c4535 == null) {
                    throw new IllegalStateException("YukiHookPrefsBridge missing Context instance");
                }
            }
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (AbstractC0183.m405(c4535) != null) {
            c4535 = (SharedPreferences) linkedHashMap.get(this.f4945 + m3070());
            if (c4535 == null) {
                Context context2 = this.f4945;
                if (context2 == null || (c4535 = context2.getSharedPreferences(m3070(), 0)) == null) {
                    c4535 = null;
                } else {
                    this.f4943 = false;
                    linkedHashMap.put(this.f4945 + m3070(), c4535);
                }
                if (c4535 == null) {
                    C1078.m2276("YukiHookPrefsBridge missing Context instance");
                    return null;
                }
            }
        }
        return (SharedPreferences) c4535;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[PHI: r7
  0x001b: PHI (r7v16 java.lang.String) = (r7v13 java.lang.String), (r7v17 java.lang.String) binds: [B:13:0x0025, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[PHI: r7
  0x0053: PHI (r7v11 java.util.Set<java.lang.String>) = (r7v8 java.util.Set<java.lang.String>), (r7v12 java.util.Set<java.lang.String>) binds: [B:30:0x005d, B:26:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۥُ */
    public final Object m3068(Object obj, String str) {
        Set<String> stringSet;
        Set<String> set;
        String string;
        String str2;
        boolean z = obj instanceof String;
        boolean z2 = f4940;
        try {
            if (z) {
                String str3 = (String) obj;
                if (!z2 || this.f4946) {
                    string = m3067().getString(str, str3);
                    str2 = str3;
                    if (string != null) {
                        str2 = str3;
                        str2 = string;
                    }
                } else {
                    string = m3072().getString(str, str3);
                    if (string != null) {
                        str2 = str3;
                        str2 = string;
                    }
                }
                if (z2 || this.f4943) {
                    return str2;
                }
                AbstractC2765.m5147(this.f4945, m3070().concat(".xml"));
                obj = str2;
            } else {
                if (!(obj instanceof Set)) {
                    if (obj instanceof Integer) {
                        int iIntValue = ((Number) obj).intValue();
                        int i = (!z2 || this.f4946) ? m3067().getInt(str, iIntValue) : m3072().getInt(str, iIntValue);
                        if (!z2 && !this.f4943) {
                            try {
                                AbstractC2765.m5147(this.f4945, m3070().concat(".xml"));
                            } catch (Throwable unused) {
                            }
                        }
                        return Integer.valueOf(i);
                    }
                    if (obj instanceof Float) {
                        float fFloatValue = ((Number) obj).floatValue();
                        float f = (!z2 || this.f4946) ? m3067().getFloat(str, fFloatValue) : m3072().getFloat(str, fFloatValue);
                        if (!z2 && !this.f4943) {
                            try {
                                AbstractC2765.m5147(this.f4945, m3070().concat(".xml"));
                            } catch (Throwable unused2) {
                            }
                        }
                        return Float.valueOf(f);
                    }
                    if (obj instanceof Long) {
                        long jLongValue = ((Number) obj).longValue();
                        long j = (!z2 || this.f4946) ? m3067().getLong(str, jLongValue) : m3072().getLong(str, jLongValue);
                        if (!z2 && !this.f4943) {
                            try {
                                AbstractC2765.m5147(this.f4945, m3070().concat(".xml"));
                            } catch (Throwable unused3) {
                            }
                        }
                        return Long.valueOf(j);
                    }
                    if (!(obj instanceof Boolean)) {
                        C1078.m2278(AbstractC3761.m6629("Key-Value type ", obj != null ? obj.getClass().getName() : null, " is not allowed"));
                        return null;
                    }
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    boolean z3 = (!z2 || this.f4946) ? m3067().getBoolean(str, zBooleanValue) : m3072().getBoolean(str, zBooleanValue);
                    if (!z2 && !this.f4943) {
                        try {
                            AbstractC2765.m5147(this.f4945, m3070().concat(".xml"));
                        } catch (Throwable unused4) {
                        }
                    }
                    return Boolean.valueOf(z3);
                }
                Set<String> set2 = (Set) obj;
                if (!z2 || this.f4946) {
                    stringSet = m3067().getStringSet(str, set2);
                    set = set2;
                    if (stringSet != null) {
                        set = set2;
                        set = stringSet;
                    }
                } else {
                    stringSet = m3072().getStringSet(str, set2);
                    if (stringSet != null) {
                        set = set2;
                        set = stringSet;
                    }
                }
                if (z2 || this.f4943) {
                    return set;
                }
                AbstractC2765.m5147(this.f4945, m3070().concat(".xml"));
                obj = set;
            }
            return obj;
        } catch (Throwable unused5) {
            return obj;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m3069() {
        if (f4940 && this.f4945 == null) {
            C1967.f6501.getClass();
            Application applicationM3850 = C1967.m3850();
            if (applicationM3850 == null) {
                C1078.m2276("The Host App's Context has not yet initialized successfully, the native function cannot be used at this time");
                return;
            }
            this.f4945 = applicationM3850;
        }
        this.f4946 = true;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final String m3070() {
        String packageName;
        String packageName2;
        String str = this.f4944;
        if (!AbstractC0684.m1534(str)) {
            return str;
        }
        String str2 = "unknown";
        if (this.f4946) {
            Context context = this.f4945;
            if (context != null && (packageName2 = context.getPackageName()) != null) {
                str2 = packageName2;
            }
            return str2.concat("_preferences");
        }
        String str3 = C0113.f448;
        if (AbstractC0684.m1534(str3)) {
            Context context2 = this.f4945;
            if (context2 != null && (packageName = context2.getPackageName()) != null) {
                str2 = packageName;
            }
            str3 = str2;
        }
        return ((Object) str3) + "_preferences";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3071(InterfaceC4745 interfaceC4745) {
        C2518 c2518 = new C2518(this);
        interfaceC4745.mo211(c2518);
        SharedPreferences.Editor editor = c2518.f8351;
        if (editor != null) {
            editor.apply();
        }
        if (f4940 || this.f4943) {
            return;
        }
        try {
            AbstractC2765.m5147(this.f4945, m3070().concat(".xml"));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final XSharedPreferences m3072() {
        XSharedPreferences c4535;
        if (f4940 && AbstractC0684.m1534(C0113.f448)) {
            C1078.m2276("Xposed modulePackageName load failed, please reset and rebuild it");
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = f4941;
            C4419 c4419 = (C4419) linkedHashMap.get(m3070());
            if (c4419 == null || (c4535 = (XSharedPreferences) c4419.f14569.getValue()) == null) {
                C4419 c44110 = new C4419(C0113.f448, m3070());
                linkedHashMap.put(m3070(), c44110);
                c4535 = (XSharedPreferences) c44110.f14569.getValue();
            }
            c4535.makeWorldReadable();
            c4535.reload();
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 != null) {
            ArrayList arrayList = C2503.f8322;
            String message = thM405.getMessage();
            if (message == null) {
                message = "Operating system not supported";
            }
            C2503.m4657(4, message, thM405);
        }
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
        XSharedPreferences xSharedPreferences = c4535;
        if (xSharedPreferences != null) {
            return xSharedPreferences;
        }
        C1078.m2276("Cannot load the XSharedPreferences, maybe is your Hook Framework not support it");
        return null;
    }
}
