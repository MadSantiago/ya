package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥۢؗؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2632 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f8741;

    /* JADX INFO: renamed from: ۥُ */
    public final long f8742;

    /* JADX INFO: renamed from: ۥۗ */
    public final Class f8743;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f8744;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f8745;

    public C2632(String str, Class cls, boolean z, boolean z2) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            C1078.m2272("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                C1078.m2272("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.f8744 = str;
        this.f8743 = cls;
        this.f8741 = z;
        this.f8745 = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f8742 = j;
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f8743.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f8744;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        sb.append(name);
        sb.append("/");
        sb.append(str);
        sb.append("[");
        return AbstractC3761.m6621(sb, name2, "]");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void mo4951(Object obj, C5408 c5408) {
        c5408.m9090(obj, this.f8744);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void mo4952(Iterator it, C5408 c5408) {
        while (it.hasNext()) {
            mo4951(it.next(), c5408);
        }
    }
}
