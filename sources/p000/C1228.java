package p000;

/* JADX INFO: renamed from: ۥَْؖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1228 extends RuntimeException {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4225;

    public C1228(C4633 c4633) {
        this.f4225 = 3;
        StringBuilder sb = new StringBuilder("HTTP ");
        C2147 c2147 = c4633.f15293;
        sb.append(c2147.f7033);
        sb.append(" ");
        sb.append(c2147.f7032);
        super(sb.toString());
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static String m2593(String str, int i, int i2, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C1228 m2594(int i, String str, String str2) {
        return new C1228(9, m2593(str, i, i + 1, str2));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C1228 m2595(String str, int i, int i2, String str2) {
        return new C1228(9, m2593(str, i, i2, str2));
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f4225) {
            case 9:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1228(int i, String str) {
        super(str);
        this.f4225 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1228(int i, String str, Throwable th) {
        super(str, th);
        this.f4225 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1228(Throwable th) {
        super(th);
        this.f4225 = 8;
    }

    public /* synthetic */ C1228(int i) {
        this.f4225 = i;
    }
}
