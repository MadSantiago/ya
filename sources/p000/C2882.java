package p000;

/* JADX INFO: renamed from: ۥۧؖٛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2882 implements InterfaceC0759 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C1397 f9613;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC3127 f9614;

    public C2882(C1397 c1397, AbstractC3127 abstractC3127) {
        C4369 c4369 = AbstractC4827.f15889;
        this.f9613 = c1397;
        this.f9614 = abstractC3127;
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1646(Object obj, Object obj2) {
        AbstractC2569.m4855(obj, obj2);
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1647(Object obj, C2391 c2391) {
        throw AbstractC2049.m3995(obj);
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo1648(Object obj) {
        throw AbstractC2049.m3995(obj);
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1649(AbstractC5212 abstractC5212) {
        return abstractC5212.zzc.hashCode();
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo1650(AbstractC5212 abstractC5212, AbstractC5212 abstractC5213) {
        return abstractC5212.zzc.equals(abstractC5213.zzc);
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC5212 mo1651() {
        AbstractC3127 abstractC3127 = this.f9614;
        if (abstractC3127 instanceof AbstractC5212) {
            return ((AbstractC5212) abstractC3127).m8831();
        }
        AbstractC0955 abstractC0955 = (AbstractC0955) ((AbstractC5212) abstractC3127).mo554(5);
        boolean zM8824 = abstractC0955.f3388.m8824();
        AbstractC5212 abstractC5212 = abstractC0955.f3388;
        if (!zM8824) {
            return abstractC5212;
        }
        abstractC5212.getClass();
        C4946.f16366.m8330(abstractC5212.getClass()).mo1654(abstractC5212);
        abstractC5212.m8825();
        return abstractC0955.f3388;
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1652(AbstractC3127 abstractC3127) {
        C3192 c3192 = ((AbstractC5212) abstractC3127).zzc;
        int i = c3192.f10726;
        if (i != -1) {
            return i;
        }
        int iM4000 = 0;
        for (int i2 = 0; i2 < c3192.f10725; i2++) {
            int i3 = c3192.f10724[i2] >>> 3;
            AbstractC4314 abstractC4314 = (AbstractC4314) c3192.f10722[i2];
            int iM935 = AbstractC0438.m935(8);
            int iM936 = AbstractC0438.m935(i3) + AbstractC0438.m935(16);
            int iM937 = AbstractC0438.m935(24);
            int iMo7605 = abstractC4314.mo7605();
            iM4000 += iM935 + iM935 + iM936 + AbstractC2049.m4000(iMo7605, iMo7605, iM937);
        }
        c3192.f10726 = iM4000;
        return iM4000;
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۦِ */
    public final void mo1653(Object obj, byte[] bArr, int i, int i2, C0958 c0958) {
        AbstractC5212 abstractC5212 = (AbstractC5212) obj;
        if (abstractC5212.zzc == C3192.f10721) {
            abstractC5212.zzc = C3192.m5886();
        }
        throw AbstractC2049.m3995(obj);
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo1654(Object obj) {
        this.f9613.getClass();
        C3192 c3192 = ((AbstractC5212) obj).zzc;
        if (c3192.f10723) {
            c3192.f10723 = false;
        }
        C4369 c4369 = AbstractC4827.f15889;
        throw AbstractC2049.m3995(obj);
    }

    @Override // p000.InterfaceC0759
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo1655(Object obj, C4902 c4902, C2955 c2955) {
        this.f9613.getClass();
        C1397.m2959(obj);
        obj.getClass();
        throw new ClassCastException();
    }
}
