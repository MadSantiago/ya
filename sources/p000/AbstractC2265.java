package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٕٜۚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2265 implements InterfaceC0103 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0103 f7522;

    public AbstractC2265(InterfaceC0103 interfaceC0103) {
        this.f7522 = interfaceC0103;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2265)) {
            return false;
        }
        AbstractC2265 abstractC2265 = (AbstractC2265) obj;
        return AbstractC3831.m6874(this.f7522, abstractC2265.f7522) && AbstractC3831.m6874(mo186(), abstractC2265.mo186());
    }

    public final int hashCode() {
        return mo186().hashCode() + (this.f7522.hashCode() * 31);
    }

    public final String toString() {
        return mo186() + '(' + this.f7522 + ')';
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0487 mo183() {
        return C3626.f12099;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥُ */
    public final String mo184(int i) {
        return String.valueOf(i);
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo188(String str) {
        Integer numM8358 = AbstractC4981.m8358(str);
        if (numM8358 != null) {
            return numM8358.intValue();
        }
        C1078.m2272(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo189() {
        return 1;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC0103 mo190(int i) {
        if (i >= 0) {
            return this.f7522;
        }
        StringBuilder sbM8680 = AbstractC5078.m8680(i, "Illegal index ", ", ");
        sbM8680.append(mo186());
        sbM8680.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM8680.toString().toString());
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۦٛ */
    public final List mo191(int i) {
        if (i >= 0) {
            return C2340.f7777;
        }
        StringBuilder sbM8680 = AbstractC5078.m8680(i, "Illegal index ", ", ");
        sbM8680.append(mo186());
        sbM8680.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM8680.toString().toString());
    }
}
