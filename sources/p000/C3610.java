package p000;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: ۦؚؚٟؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3610 extends AbstractC0243 {

    /* JADX INFO: renamed from: ۥؓ */
    public final C5590 f12015;

    /* JADX INFO: renamed from: ۥؖ */
    public final C5590 f12016;

    /* JADX INFO: renamed from: ۥَ */
    public String f12017;

    /* JADX INFO: renamed from: ۥْ */
    public char f12018;

    /* JADX INFO: renamed from: ۥٓ */
    public long f12019;

    /* JADX INFO: renamed from: ۥٖ */
    public final C5590 f12020;

    /* JADX INFO: renamed from: ۥٙ */
    public final C5590 f12021;

    /* JADX INFO: renamed from: ۥۖ */
    public final C5590 f12022;

    /* JADX INFO: renamed from: ۥۧ */
    public final C5590 f12023;

    /* JADX INFO: renamed from: ۦٕ */
    public final C5590 f12024;

    /* JADX INFO: renamed from: ۦٗ */
    public final C5590 f12025;

    /* JADX INFO: renamed from: ۦۛ */
    public final C5590 f12026;

    public C3610(C5371 c5371) {
        super(c5371);
        this.f12018 = (char) 0;
        this.f12019 = -1L;
        this.f12020 = new C5590(this, 6, false, false);
        this.f12025 = new C5590(this, 6, true, false);
        this.f12026 = new C5590(this, 6, false, true);
        this.f12022 = new C5590(this, 5, false, false);
        this.f12024 = new C5590(this, 5, true, false);
        this.f12021 = new C5590(this, 5, false, true);
        this.f12016 = new C5590(this, 4, false, false);
        this.f12015 = new C5590(this, 3, false, false);
        this.f12023 = new C5590(this, 2, false, false);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static String m6438(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof C1005) {
                return ((C1005) obj).f3589;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = C5371.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static String m6439(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strM6438 = m6438(obj, z);
        String strM6439 = m6438(obj2, z);
        String strM64310 = m6438(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM6438)) {
            sb.append(str2);
            sb.append(strM6438);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM6439)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM6439);
        }
        if (!TextUtils.isEmpty(strM64310)) {
            sb.append(str3);
            sb.append(strM64310);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static C1005 m6440(String str) {
        if (str == null) {
            return null;
        }
        return new C1005(str);
    }

    @Override // p000.AbstractC0243
    /* JADX INFO: renamed from: ۥٓ */
    public final boolean mo504() {
        return false;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final String m6441() {
        String str;
        synchronized (this) {
            try {
                str = this.f12017;
                if (str == null) {
                    ((C5371) ((C5371) this.f18660).f17715.f18660).getClass();
                    str = "FA";
                    this.f12017 = "FA";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m6442(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m6441(), i)) {
            Log.println(i, m6441(), m6439(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        AbstractC0487.m1047(str);
        C3644 c3644 = ((C5371) this.f18660).f17733;
        if (c3644 == null) {
            Log.println(6, m6441(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c3644.f911) {
                Log.println(6, m6441(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            c3644.m6515(new RunnableC3788(this, i, str, obj, obj2, obj3));
        }
    }
}
