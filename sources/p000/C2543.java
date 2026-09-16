package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥۡؑۧٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2543 implements InterfaceC0103 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f8491;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3131 f8492;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2148 f8493;

    public C2543(C2148 c2148, C3131 c3131) {
        this.f8493 = c2148;
        this.f8492 = c3131;
        this.f8491 = c2148.f7048 + '<' + c3131.m5775() + '>';
    }

    public final boolean equals(Object obj) {
        C2543 c2543 = obj instanceof C2543 ? (C2543) obj : null;
        return c2543 != null && this.f8493.equals(c2543.f8493) && c2543.f8492.equals(this.f8492);
    }

    @Override // p000.InterfaceC0103
    public final List getAnnotations() {
        return C2340.f7777;
    }

    public final int hashCode() {
        return this.f8491.hashCode() + (this.f8492.hashCode() * 31);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f8492 + ", original: " + this.f8493 + ')';
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0487 mo183() {
        return this.f8493.f7046;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥُ */
    public final String mo184(int i) {
        return this.f8493.f7044[i];
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo185() {
        return false;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo186() {
        return this.f8491;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo187() {
        return false;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo188(String str) {
        return this.f8493.mo188(str);
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo189() {
        return this.f8493.f7043;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC0103 mo190(int i) {
        return this.f8493.f7045[i];
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦٛ */
    public final List mo191(int i) {
        return this.f8493.f7052[i];
    }
}
