package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥؑؓۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0188 extends AbstractC4009 {

    /* JADX INFO: renamed from: ۦؚ */
    public int f698;

    /* JADX INFO: renamed from: ۦۚ */
    public int f701;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f702;

    /* JADX INFO: renamed from: ۦۗ */
    public AbstractC5682[] f700 = new AbstractC5682[16];

    /* JADX INFO: renamed from: ۦٌ */
    public int[] f699 = new int[16];

    /* JADX INFO: renamed from: ۦۨ */
    public Object[] f703 = new Object[16];

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m450(InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        if (this.f698 != 0) {
            C4902 c4902 = new C4902(this);
            C0188 c0188 = (C0188) c4902.f16167;
            while (true) {
                AbstractC5682 abstractC5682 = c0188.f700[c4902.f16168];
                C4356 c4356Mo1763 = abstractC5682.mo1763(c4902);
                InterfaceC4790 interfaceC4791 = interfaceC4790;
                C0126 c0127 = c0126;
                C0175 c0176 = c0175;
                InterfaceC4617 interfaceC4618 = interfaceC4617;
                try {
                    abstractC5682.mo182(c4902, interfaceC4791, c0127, c0176, interfaceC4618);
                    int i = c4902.f16168;
                    int i2 = c0188.f698;
                    if (i < i2) {
                        AbstractC5682 abstractC5683 = c0188.f700[i];
                        c4902.f16166 += abstractC5683.f18679;
                        c4902.f16170 += abstractC5683.f18678;
                        int i3 = i + 1;
                        c4902.f16168 = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        interfaceC4790 = interfaceC4791;
                        c0126 = c0127;
                        c0175 = c0176;
                        interfaceC4617 = interfaceC4618;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (interfaceC4618 == null) {
                        throw th;
                    }
                    AbstractC0487.m1058(th, new C1597(c4356Mo1763, c0127, interfaceC4618, 12));
                    throw th;
                }
            }
        }
        m453();
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final boolean m451() {
        return this.f698 == 0;
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final void m452(AbstractC5682 abstractC5682) {
        int i = this.f698;
        AbstractC5682[] abstractC5682Arr = this.f700;
        if (i == abstractC5682Arr.length) {
            AbstractC5682[] abstractC5682Arr2 = new AbstractC5682[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(abstractC5682Arr, 0, abstractC5682Arr2, 0, i);
            this.f700 = abstractC5682Arr2;
        }
        int i2 = this.f701;
        int i3 = abstractC5682.f18679;
        int i4 = abstractC5682.f18678;
        int i5 = i2 + i3;
        int[] iArr = this.f699;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            AbstractC0246.m523(0, 0, length, iArr, iArr2);
            this.f699 = iArr2;
        }
        int i7 = this.f702 + i4;
        Object[] objArr = this.f703;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f703 = objArr2;
        }
        AbstractC5682[] abstractC5682Arr3 = this.f700;
        int i9 = this.f698;
        this.f698 = i9 + 1;
        abstractC5682Arr3[i9] = abstractC5682;
        this.f701 += abstractC5682.f18679;
        this.f702 += i4;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m453() {
        this.f698 = 0;
        this.f701 = 0;
        Arrays.fill(this.f703, 0, this.f702, (Object) null);
        this.f702 = 0;
    }
}
