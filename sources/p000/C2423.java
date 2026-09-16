package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٜ۟ؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2423 implements InterfaceC0103 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2204 f8076;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f8077;

    public C2423(String str, C2204 c2204) {
        this.f8077 = str;
        this.f8076 = c2204;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2423)) {
            return false;
        }
        C2423 c2423 = (C2423) obj;
        return this.f8077.equals(c2423.f8077) && AbstractC3831.m6874(this.f8076, c2423.f8076);
    }

    public final int hashCode() {
        return (this.f8076.hashCode() * 31) + this.f8077.hashCode();
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("PrimitiveDescriptor("), this.f8077, ')');
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0487 mo183() {
        return this.f8076;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥُ */
    public final String mo184(int i) {
        m4544();
        throw null;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo186() {
        return this.f8077;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo188(String str) {
        m4544();
        throw null;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo189() {
        return 0;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC0103 mo190(int i) {
        m4544();
        throw null;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦٛ */
    public final List mo191(int i) {
        m4544();
        throw null;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m4544() {
        throw new IllegalStateException(AbstractC3761.m6621(new StringBuilder("Primitive descriptor "), this.f8077, " does not have elements"));
    }
}
