package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦّٟؑۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4004 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3385 f13349;

    /* JADX INFO: renamed from: ۥۗ */
    public static final AtomicReference f13347 = new AtomicReference();

    /* JADX INFO: renamed from: ۥؗ */
    public static final AtomicReference f13346 = new AtomicReference();

    /* JADX INFO: renamed from: ۦؑ */
    public static final AtomicReference f13348 = new AtomicReference();

    public C4004(C3385 c3385) {
        this.f13349 = c3385;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final String m7141(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC0487.m1047(atomicReference);
        AbstractC0487.m1088(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final String m7142(String str) {
        if (str == null) {
            return null;
        }
        if (this.f13349.m6148()) {
            return str.startsWith("_exp_") ? AbstractC3761.m6629("experiment_id(", str, ")") : m7141(str, AbstractC1434.f4915, AbstractC1434.f4918, f13348);
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final String m7143(Bundle bundle) {
        String strM7144;
        if (bundle == null) {
            return null;
        }
        if (!this.f13349.m6148()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m7145(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM7144 = m7144(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM7144 = m7144((Object[]) obj);
            } else {
                strM7144 = obj instanceof ArrayList ? m7144(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strM7144);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final String m7144(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strM7143 = obj instanceof Bundle ? m7143((Bundle) obj) : String.valueOf(obj);
            if (strM7143 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strM7143);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final String m7145(String str) {
        if (str == null) {
            return null;
        }
        return !this.f13349.m6148() ? str : m7141(str, AbstractC4009.f13371, AbstractC4009.f13364, f13346);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String m7146(String str) {
        if (str == null) {
            return null;
        }
        return !this.f13349.m6148() ? str : m7141(str, AbstractC1605.f5399, AbstractC1605.f5396, f13347);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final String m7147(C2679 c2679) {
        String string;
        C3385 c3385 = this.f13349;
        if (!c3385.m6148()) {
            return c2679.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c2679.f8886);
        sb.append(",name=");
        sb.append(m7146(c2679.f8889));
        sb.append(",params=");
        C5645 c5645 = c2679.f8888;
        if (c5645 == null) {
            string = null;
        } else {
            string = !c3385.m6148() ? c5645.f18597.toString() : m7143(c5645.m9478());
        }
        sb.append(string);
        return sb.toString();
    }
}
