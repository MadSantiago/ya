package p000;

/* JADX INFO: renamed from: ۦْؒؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3119 implements InterfaceC1622 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2637 f10448;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0841 f10449;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0066 f10450;

    public C3119(C0841 c0841, C2637 c2637, AbstractC0066 abstractC0066) {
        this.f10449 = c0841;
        c2637.getClass();
        this.f10448 = c2637;
        this.f10450 = abstractC0066;
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3386(Object obj, Object obj2) {
        AbstractC0499.m1137(this.f10449, obj, obj2);
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3387(Object obj) {
        this.f10449.getClass();
        C5708 c5708 = ((AbstractC0318) obj).unknownFields;
        if (c5708.f18793) {
            c5708.f18793 = false;
        }
        this.f10448.getClass();
        AbstractC2049.m4001(obj);
        throw null;
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3388(AbstractC0318 abstractC0318) {
        this.f10449.getClass();
        C5708 c5708 = abstractC0318.unknownFields;
        int i = c5708.f18796;
        if (i != -1) {
            return i;
        }
        int iM4046 = 0;
        for (int i2 = 0; i2 < c5708.f18795; i2++) {
            int i3 = c5708.f18794[i2] >>> 3;
            iM4046 += C2100.m4046(3, (C0533) c5708.f18792[i2]) + C2100.m4049(i3) + C2100.m4047(2) + (C2100.m4047(1) * 2);
        }
        c5708.f18796 = iM4046;
        return iM4046;
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3389(Object obj, C5086 c5086) {
        this.f10448.getClass();
        AbstractC2049.m4001(obj);
        throw null;
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo3390(AbstractC0318 abstractC0318, AbstractC0318 abstractC0319) {
        this.f10449.getClass();
        return abstractC0318.unknownFields.equals(abstractC0319.unknownFields);
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo3391(AbstractC0318 abstractC0318) {
        this.f10449.getClass();
        return abstractC0318.unknownFields.hashCode();
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3392(Object obj, C4902 c4902, C2336 c2336) {
        this.f10449.getClass();
        C0841.m1754(obj);
        this.f10448.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0318 mo3393() {
        AbstractC0066 abstractC0066 = this.f10450;
        return abstractC0066 instanceof AbstractC0318 ? ((AbstractC0318) abstractC0066).m678() : ((AbstractC0180) ((AbstractC0318) abstractC0066).mo674(5)).m401();
    }

    @Override // p000.InterfaceC1622
    /* JADX INFO: renamed from: ۦۙ */
    public final boolean mo3394(Object obj) {
        this.f10448.getClass();
        AbstractC2049.m4001(obj);
        throw null;
    }
}
