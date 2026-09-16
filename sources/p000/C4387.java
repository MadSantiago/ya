package p000;

import java.util.Set;

/* JADX INFO: renamed from: ۦؘٗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4387 extends AbstractC2844 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC4489 f14456;

    /* JADX INFO: renamed from: ۥُ */
    public final int f14457;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4489 f14458;

    /* JADX INFO: renamed from: ۦؑ */
    public final int[] f14459;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public C4387(AbstractC4489 abstractC4489, AbstractC4489 abstractC44810) {
        this.f14458 = abstractC4489;
        this.f14456 = abstractC44810;
        int iMo1150 = abstractC44810.mo1150();
        if (!(iMo1150 <= 28)) {
            C1078.m2272("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iMo1150];
        this.f14459 = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iMo1150) {
            C2632 c2632M7686 = m7686(i);
            long j2 = c2632M7686.f8742 | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (c2632M7686.equals(m7686(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = c2632M7686.f8741 ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.f14457 = i2;
    }

    @Override // p000.AbstractC2844
    /* JADX INFO: renamed from: ۥؗ */
    public final Set mo3074() {
        return new C3839(3, this);
    }

    @Override // p000.AbstractC2844
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo3075() {
        return this.f14457;
    }

    @Override // p000.AbstractC2844
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3076(C2441 c2441, C5408 c5408) {
        for (int i = 0; i < this.f14457; i++) {
            int i2 = this.f14459[i];
            C2632 c2632M7686 = m7686(i2 & 31);
            if (c2632M7686.f8741) {
                c2441.m4556(c2632M7686, new C0314(this, c2632M7686, i2), c5408);
            } else {
                AbstractC4489 abstractC4489 = this.f14458;
                int iMo1150 = abstractC4489.mo1150();
                if (i2 >= iMo1150) {
                    abstractC4489 = this.f14456;
                    i2 -= iMo1150;
                }
                c2441.m4557(c2632M7686, c2632M7686.f8743.cast(abstractC4489.mo1145(i2)), c5408);
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C2632 m7686(int i) {
        AbstractC4489 abstractC4489 = this.f14458;
        int iMo1150 = abstractC4489.mo1150();
        return i >= iMo1150 ? this.f14456.mo1149(i - iMo1150) : abstractC4489.mo1149(i);
    }
}
