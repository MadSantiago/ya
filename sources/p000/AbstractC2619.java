package p000;

/* JADX INFO: renamed from: ۥؚۢؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2619 extends AbstractC3398 implements InterfaceC0504 {

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean f8720;

    public AbstractC2619(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f8720 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2619) {
            AbstractC2619 abstractC2619 = (AbstractC2619) obj;
            return m6152().equals(abstractC2619.m6152()) && this.f11307.equals(abstractC2619.f11307) && this.f11305.equals(abstractC2619.f11305) && AbstractC3831.m6874(this.f11309, abstractC2619.f11309);
        }
        if (obj instanceof InterfaceC0504) {
            return obj.equals(m4949());
        }
        return false;
    }

    public final int hashCode() {
        return this.f11305.hashCode() + AbstractC5078.m8674(m6152().hashCode() * 31, 31, this.f11307);
    }

    public final String toString() {
        InterfaceC1620 interfaceC1620M4949 = m4949();
        return interfaceC1620M4949 != this ? interfaceC1620M4949.toString() : AbstractC3761.m6621(new StringBuilder("property "), this.f11307, " (Kotlin reflection is not available)");
    }

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC1620 m4949() {
        if (this.f8720) {
            return this;
        }
        InterfaceC1620 interfaceC1620 = this.f11310;
        if (interfaceC1620 != null) {
            return interfaceC1620;
        }
        InterfaceC1620 interfaceC1620Mo486 = mo486();
        this.f11310 = interfaceC1620Mo486;
        return interfaceC1620Mo486;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC0504 m4950() {
        if (this.f8720) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1620 interfaceC1620M4949 = m4949();
        if (interfaceC1620M4949 != this) {
            return (InterfaceC0504) interfaceC1620M4949;
        }
        throw new C5713("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
