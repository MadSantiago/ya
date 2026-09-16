package p000;

/* JADX INFO: renamed from: ۥٖؖؓٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0526 extends AbstractC1127 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0777 f1863;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4745 f1864;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526(InterfaceC4745 interfaceC4745, C0777 c0777) {
        super(3);
        this.f1864 = interfaceC4745;
        this.f1863 = c0777;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        long j;
        InterfaceC2427 interfaceC2427 = (InterfaceC2427) obj;
        AbstractC0275 abstractC0275Mo3597 = ((InterfaceC1827) obj2).mo3597(((C3693) obj3).f12325);
        if (interfaceC2427.mo323()) {
            if (((Boolean) this.f1864.mo211(this.f1863.f2814.getValue())).booleanValue()) {
                j = (((long) abstractC0275Mo3597.f985) << 32) | (((long) abstractC0275Mo3597.f984) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) abstractC0275Mo3597.f985) << 32) | (((long) abstractC0275Mo3597.f984) & 4294967295L);
        }
        return interfaceC2427.mo755((int) (j >> 32), (int) (4294967295L & j), C0204.f751, new C0778(abstractC0275Mo3597, 2));
    }
}
