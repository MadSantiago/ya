package p000;

/* JADX INFO: renamed from: ۦٌَٜؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4704 extends AbstractC2426 implements InterfaceC3275 {

    /* JADX INFO: renamed from: ۥَ */
    public int f15513;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Throwable f15514;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ long f15515;

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f15513;
        if (i == 0) {
            AbstractC0186.m409(obj);
            Throwable th = this.f15514;
            long j = this.f15515;
            C1984.m3874().m3879(AbstractC1018.f3605, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, AbstractC1018.f3604);
            this.f15513 = 1;
            Object objM5130 = AbstractC2765.m5130(jMin, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM5130 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC3275
    /* JADX INFO: renamed from: ۦ۟ */
    public final Object mo1822(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        C4704 c4704 = new C4704(4, (InterfaceC0443) obj4);
        c4704.f15514 = (Throwable) obj2;
        c4704.f15515 = jLongValue;
        return c4704.mo218(C2358.f7817);
    }
}
