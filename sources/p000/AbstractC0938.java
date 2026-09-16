package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٍِۣؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0938 implements InterfaceC4636 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f3333;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f3334;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3534 f3335;

    public AbstractC0938(InterfaceC3534 interfaceC3534, int i, int i2) {
        this.f3335 = interfaceC3534;
        this.f3334 = i;
        this.f3333 = i2;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        C4794 c4794 = C4794.f15814;
        InterfaceC3534 interfaceC3534 = this.f3335;
        if (interfaceC3534 != c4794) {
            arrayList.add("context=" + interfaceC3534);
        }
        int i = this.f3334;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.f3333;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(AbstractC3761.m6637(i2)));
        }
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return AbstractC5078.m8678(sb, AbstractC0973.m2056(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract Object mo1910(C3002 c3002, InterfaceC0443 interfaceC0443);

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC4707 mo1911() {
        return null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public C3002 mo1912(InterfaceC4643 interfaceC4643) throws Throwable {
        int i = this.f3334;
        if (i == -3) {
            i = -2;
        }
        InterfaceC5731 c0023 = new C0023(this, null, 10);
        C3002 c3002 = new C3002(AbstractC2774.m5173(interfaceC4643, this.f3335), AbstractC1631.m3405(i, this.f3333, 4));
        c3002.m3707(3, c3002, c0023);
        return c3002;
    }

    @Override // p000.InterfaceC4707
    /* JADX INFO: renamed from: ۥۗ */
    public Object mo1575(InterfaceC4161 interfaceC4161, InterfaceC0443 interfaceC0443) {
        Object objM7173 = AbstractC4009.m7173(new C0061(interfaceC4161, this, null, 9), interfaceC0443);
        return objM7173 == EnumC2282.f7590 ? objM7173 : C2358.f7817;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // p000.InterfaceC4636
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4707 mo1913(InterfaceC3534 interfaceC3534, int i, int i2) {
        InterfaceC3534 interfaceC3535 = this.f3335;
        InterfaceC3534 interfaceC3534Mo860 = interfaceC3534.mo860(interfaceC3535);
        int i3 = this.f3333;
        int i4 = this.f3334;
        if (i2 == 1) {
            if (i4 != -3) {
                if (i == -3) {
                    i = i4;
                } else if (i4 != -2) {
                    if (i == -2) {
                        i = i4;
                    } else {
                        i += i4;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i2 = i3;
        }
        return (AbstractC3831.m6874(interfaceC3534Mo860, interfaceC3535) && i == i4 && i2 == i3) ? this : mo1813(interfaceC3534Mo860, i, i2);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public abstract AbstractC0938 mo1813(InterfaceC3534 interfaceC3534, int i, int i2);
}
