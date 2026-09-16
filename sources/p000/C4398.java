package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٗۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4398 implements InterfaceC0103 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0103 f14485;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0103 f14486;

    public C4398(InterfaceC0103 interfaceC0103, InterfaceC0103 interfaceC0104) {
        this.f14486 = interfaceC0103;
        this.f14485 = interfaceC0104;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4398)) {
            return false;
        }
        C4398 c4398 = (C4398) obj;
        return AbstractC3831.m6874(this.f14486, c4398.f14486) && AbstractC3831.m6874(this.f14485, c4398.f14485);
    }

    public final int hashCode() {
        return this.f14485.hashCode() + ((this.f14486.hashCode() + 710441009) * 31);
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f14486 + ", " + this.f14485 + ')';
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0487 mo183() {
        return C3626.f12100;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥُ */
    public final String mo184(int i) {
        return String.valueOf(i);
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo186() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo188(String str) {
        Integer numM8358 = AbstractC4981.m8358(str);
        if (numM8358 != null) {
            return numM8358.intValue();
        }
        C1078.m2272(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo189() {
        return 2;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC0103 mo190(int i) {
        if (i < 0) {
            C1078.m2273(AbstractC5078.m8681(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f14486;
        }
        if (i2 == 1) {
            return this.f14485;
        }
        C1078.m2276("Unreached");
        return null;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦٛ */
    public final List mo191(int i) {
        if (i >= 0) {
            return C2340.f7777;
        }
        C1078.m2273(AbstractC5078.m8681(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }
}
