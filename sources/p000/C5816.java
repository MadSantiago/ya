package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۦۧؓۙؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5816 implements InterfaceC4976 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f19151;

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ C5816 f19149 = new C5816(0);

    /* JADX INFO: renamed from: ۥؗ */
    public static final /* synthetic */ C5816 f19147 = new C5816(1);

    /* JADX INFO: renamed from: ۦؑ */
    public static final /* synthetic */ C5816 f19150 = new C5816(2);

    /* JADX INFO: renamed from: ۥُ */
    public static final /* synthetic */ C5816 f19148 = new C5816(3);

    public /* synthetic */ C5816(int i) {
        this.f19151 = i;
    }

    @Override // p000.InterfaceC4976
    public final Object apply(Object obj) {
        switch (this.f19151) {
            case 0:
                Context context = (Context) obj;
                String strM7684 = AbstractC4532.f14983;
                if (strM7684 == null) {
                    synchronized (AbstractC4532.class) {
                        try {
                            strM7684 = AbstractC4532.f14983;
                            if (strM7684 == null) {
                                strM7684 = AbstractC4385.m7684(context, "com.google.android.gms.measurement");
                                AbstractC4532.f14983 = strM7684;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return strM7684;
            case 1:
                C4601 c4601 = C3001.f10092;
                return "";
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1927 c1927 = (C1927) obj;
                C1846 c1846M549 = C0268.m549();
                if (c1927 == null) {
                    return (C0268) c1846M549.m1977();
                }
                for (C2027 c2027 : c1927.m3787()) {
                    C4001 c4001M8755 = C5161.m8755();
                    String strM3973 = c2027.m3973();
                    c4001M8755.m1979();
                    ((C5161) c4001M8755.f3388).m8763(strM3973);
                    int iM3977 = c2027.m3977();
                    int i = iM3977 - 1;
                    if (iM3977 == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jM3972 = c2027.m3972();
                        c4001M8755.m1979();
                        ((C5161) c4001M8755.f3388).m8757(jM3972);
                    } else if (i == 1) {
                        boolean zM3975 = c2027.m3975();
                        c4001M8755.m1979();
                        ((C5161) c4001M8755.f3388).m8756(zM3975);
                    } else if (i == 2) {
                        double dM3979 = c2027.m3979();
                        c4001M8755.m1979();
                        ((C5161) c4001M8755.f3388).m8765(dM3979);
                    } else if (i == 3) {
                        String strM3981 = c2027.m3981();
                        c4001M8755.m1979();
                        ((C5161) c4001M8755.f3388).m8758(strM3981);
                    } else {
                        if (i != 4) {
                            C1078.m2276("No known flag type");
                            return null;
                        }
                        AbstractC4314 abstractC4314M3976 = c2027.m3976();
                        c4001M8755.m1979();
                        ((C5161) c4001M8755.f3388).m8767(abstractC4314M3976);
                    }
                    C5161 c5161 = (C5161) c4001M8755.m1977();
                    c1846M549.m1979();
                    ((C0268) c1846M549.f3388).m560(c5161);
                }
                String strM3785 = c1927.m3785();
                c1846M549.m1979();
                ((C0268) c1846M549.f3388).m558(strM3785);
                String strM3779 = c1927.m3779();
                c1846M549.m1979();
                ((C0268) c1846M549.f3388).m551(strM3779);
                long jM3783 = c1927.m3783();
                c1846M549.m1979();
                ((C0268) c1846M549.f3388).m552(jM3783);
                if (c1927.m3778()) {
                    AbstractC4314 abstractC4314M3781 = c1927.m3781();
                    c1846M549.m1979();
                    ((C0268) c1846M549.f3388).m550(abstractC4314M3781);
                }
                return (C0268) c1846M549.m1977();
            default:
                C3849 c3849 = (C3849) obj;
                if (c3849.f12867 != 29514) {
                    throw c3849;
                }
                C5196 c5196M9739 = C5914.m9739();
                C5218 c5218M7648 = C4357.m7648();
                long jCurrentTimeMillis = System.currentTimeMillis();
                c5218M7648.m1979();
                ((C4357) c5218M7648.f3388).m7659(jCurrentTimeMillis);
                c5196M9739.m1979();
                ((C5914) c5196M9739.f3388).m9742((C4357) c5218M7648.m1977());
                return (C5914) c5196M9739.m1977();
        }
    }
}
