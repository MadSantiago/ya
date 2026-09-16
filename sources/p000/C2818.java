package p000;

/* JADX INFO: renamed from: ۥۦؖٛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2818 extends AbstractC3398 implements InterfaceC3720, InterfaceC1620, InterfaceC0400 {

    /* JADX INFO: renamed from: ۦٗ */
    public final int f9421;

    public C2818(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f9421 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2818) {
            C2818 c2818 = (C2818) obj;
            return this.f11307.equals(c2818.f11307) && this.f11305.equals(c2818.f11305) && AbstractC3831.m6874(this.f11309, c2818.f11309) && m6152().equals(c2818.m6152());
        }
        if (!(obj instanceof C2818)) {
            return false;
        }
        InterfaceC1620 interfaceC1620 = this.f11310;
        if (interfaceC1620 == null) {
            mo486();
            this.f11310 = this;
            this = this;
        } else {
            r2 = interfaceC1620;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        m6152();
        return this.f11305.hashCode() + AbstractC5078.m8674(m6152().hashCode() * 31, 31, this.f11307);
    }

    public final String toString() {
        InterfaceC1620 interfaceC1620 = this.f11310;
        if (interfaceC1620 == null) {
            mo486();
            this.f11310 = this;
            interfaceC1620 = this;
        }
        if (interfaceC1620 != this) {
            return interfaceC1620.toString();
        }
        String str = this.f11307;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC3761.m6629("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // p000.InterfaceC3720
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1856() {
        return this.f9421;
    }

    @Override // p000.AbstractC3398
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC1620 mo486() {
        AbstractC5041.f16726.getClass();
        return this;
    }

    public C2818(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, C5106.f16949, str, str2);
    }
}
