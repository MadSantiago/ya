package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۥِؔٙٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1101 implements InterfaceC0103, InterfaceC3717 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Set f3870;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f3871;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0103 f3872;

    public C1101(InterfaceC0103 interfaceC0103) {
        this.f3872 = interfaceC0103;
        this.f3871 = interfaceC0103.mo186() + '?';
        this.f3870 = AbstractC0186.m424(interfaceC0103);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1101) {
            return AbstractC3831.m6874(this.f3872, ((C1101) obj).f3872);
        }
        return false;
    }

    @Override // p000.InterfaceC0103
    public final List getAnnotations() {
        return this.f3872.getAnnotations();
    }

    public final int hashCode() {
        return this.f3872.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3872);
        sb.append('?');
        return sb.toString();
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0487 mo183() {
        return this.f3872.mo183();
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥُ */
    public final String mo184(int i) {
        return this.f3872.mo184(i);
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo185() {
        return this.f3872.mo185();
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo186() {
        return this.f3871;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo187() {
        return true;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo188(String str) {
        return this.f3872.mo188(str);
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo189() {
        return this.f3872.mo189();
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC0103 mo190(int i) {
        return this.f3872.mo190(i);
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦٛ */
    public final List mo191(int i) {
        return this.f3872.mo191(i);
    }

    @Override // p000.InterfaceC3717
    /* JADX INFO: renamed from: ۦۙ */
    public final Set mo2326() {
        return this.f3870;
    }
}
