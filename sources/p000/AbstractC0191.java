package p000;

/* JADX INFO: renamed from: ۥۣۣؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0191 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4824 f706 = new C4824();

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f707 = false;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0796 f708;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0191 f709;

    public /* synthetic */ AbstractC0191(AbstractC0191 abstractC0191, C0796 c0796) {
        if (abstractC0191 != null) {
            AbstractC0949.m1941(abstractC0191.f707);
        }
        this.f709 = abstractC0191;
        this.f708 = c0796;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (AbstractC0191 abstractC0191 = this; abstractC0191 != null; abstractC0191 = abstractC0191.f709) {
            for (int i = 0; i < abstractC0191.f708.f2862; i++) {
                sb.append("[");
                sb.append(this.f708.m1697(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m454() {
        if (this.f708.containsKey(f706)) {
            return true;
        }
        AbstractC0191 abstractC0191 = this.f709;
        return abstractC0191 != null && abstractC0191.m454();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0191 m455() {
        if (this.f707) {
            C1078.m2276("Already frozen");
            return null;
        }
        this.f707 = true;
        AbstractC0191 abstractC0191 = this.f709;
        return (abstractC0191 == null || !this.f708.isEmpty()) ? this : abstractC0191;
    }
}
