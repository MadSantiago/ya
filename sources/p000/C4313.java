package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦّٖؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4313 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ int f14256;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4734 f14257;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734 f14258;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2148 f14259;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4313(final InterfaceC4734 interfaceC4734, final InterfaceC4734 interfaceC4735, int i) {
        this(interfaceC4734, interfaceC4735, (byte) 0);
        this.f14256 = i;
        final int i2 = 0;
        switch (i) {
            case 1:
                this(interfaceC4734, interfaceC4735, (byte) 0);
                final int i3 = 1;
                this.f14259 = AbstractC1631.m3428("kotlin.Pair", new InterfaceC0103[0], new InterfaceC4745() { // from class: ۦٖۢؗٝ
                    @Override // p000.InterfaceC4745
                    /* JADX INFO: renamed from: ۦؚ */
                    public final Object mo211(Object obj) {
                        int i4 = i3;
                        C2358 c2358 = C2358.f7817;
                        InterfaceC4734 interfaceC4736 = interfaceC4735;
                        InterfaceC4734 interfaceC4737 = interfaceC4734;
                        C1917 c1917 = (C1917) obj;
                        switch (i4) {
                            case 0:
                                C1917.m3751(c1917, "key", interfaceC4737.mo193());
                                C1917.m3751(c1917, "value", interfaceC4736.mo193());
                                break;
                            default:
                                C1917.m3751(c1917, "first", interfaceC4737.mo193());
                                C1917.m3751(c1917, "second", interfaceC4736.mo193());
                                break;
                        }
                        return c2358;
                    }
                });
                break;
            default:
                this.f14259 = AbstractC1631.m3433("kotlin.collections.Map.Entry", C3626.f12100, new InterfaceC0103[0], new InterfaceC4745() { // from class: ۦٖۢؗٝ
                    @Override // p000.InterfaceC4745
                    /* JADX INFO: renamed from: ۦؚ */
                    public final Object mo211(Object obj) {
                        int i4 = i2;
                        C2358 c2358 = C2358.f7817;
                        InterfaceC4734 interfaceC4736 = interfaceC4735;
                        InterfaceC4734 interfaceC4737 = interfaceC4734;
                        C1917 c1917 = (C1917) obj;
                        switch (i4) {
                            case 0:
                                C1917.m3751(c1917, "key", interfaceC4737.mo193());
                                C1917.m3751(c1917, "value", interfaceC4736.mo193());
                                break;
                            default:
                                C1917.m3751(c1917, "first", interfaceC4737.mo193());
                                C1917.m3751(c1917, "second", interfaceC4736.mo193());
                                break;
                        }
                        return c2358;
                    }
                });
                break;
        }
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        int i = this.f14256;
        return this.f14259;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        Object c4647;
        InterfaceC0103 interfaceC0103Mo193 = mo193();
        InterfaceC5308 interfaceC5308Mo4114 = interfaceC2125.mo4114(interfaceC0103Mo193);
        Object obj = AbstractC4489.f14854;
        Object objMo5162 = obj;
        Object objMo5163 = objMo5162;
        while (true) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(mo193());
            if (iMo6291 == -1) {
                if (objMo5162 == obj) {
                    throw new C0480("Element 'key' is missing");
                }
                if (objMo5163 == obj) {
                    throw new C0480("Element 'value' is missing");
                }
                switch (this.f14256) {
                    case 0:
                        c4647 = new C4647(objMo5162, objMo5163);
                        break;
                    default:
                        c4647 = new C3869(objMo5162, objMo5163);
                        break;
                }
                interfaceC5308Mo4114.mo5156(interfaceC0103Mo193);
                return c4647;
            }
            if (iMo6291 == 0) {
                objMo5162 = interfaceC5308Mo4114.mo5162(mo193(), 0, this.f14258, null);
            } else {
                if (iMo6291 != 1) {
                    throw new C0480(AbstractC5078.m8670(iMo6291, "Invalid index: "));
                }
                objMo5163 = interfaceC5308Mo4114.mo5162(mo193(), 1, this.f14257, null);
            }
        }
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        Object key;
        Object value;
        C3782 c3782M6691 = c3782.m6691(mo193());
        InterfaceC0103 interfaceC0103Mo193 = mo193();
        InterfaceC4734 interfaceC4734 = this.f14258;
        int i = this.f14256;
        switch (i) {
            case 0:
                key = ((Map.Entry) obj).getKey();
                break;
            default:
                key = ((C3869) obj).f12915;
                break;
        }
        c3782M6691.m6699(interfaceC0103Mo193, 0, interfaceC4734, key);
        InterfaceC0103 interfaceC0103Mo194 = mo193();
        InterfaceC4734 interfaceC4735 = this.f14257;
        switch (i) {
            case 0:
                value = ((Map.Entry) obj).getValue();
                break;
            default:
                value = ((C3869) obj).f12914;
                break;
        }
        c3782M6691.m6699(interfaceC0103Mo194, 1, interfaceC4735, value);
        mo193();
        c3782M6691.m6683();
    }

    public C4313(InterfaceC4734 interfaceC4734, InterfaceC4734 interfaceC4735, byte b) {
        this.f14258 = interfaceC4734;
        this.f14257 = interfaceC4735;
    }
}
