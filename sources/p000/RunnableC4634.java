package p000;

/* JADX INFO: renamed from: ۦٛؕۤؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4634 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f15294;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C4961 f15295;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f15296;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15297;

    public /* synthetic */ RunnableC4634(C4961 c4961, String str, long j, int i) {
        this.f15297 = i;
        this.f15296 = str;
        this.f15294 = j;
        this.f15295 = c4961;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15297;
        long j = this.f15294;
        String str = this.f15296;
        C4961 c4961 = this.f15295;
        switch (i) {
            case 0:
                c4961.mo6517();
                AbstractC0487.m1090(str);
                C4461 c4461 = c4961.f16409;
                if (c4461.isEmpty()) {
                    c4961.f16410 = j;
                }
                Integer num = (Integer) c4461.get(str);
                if (num != null) {
                    c4461.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c4461.f2862 < 100) {
                    c4461.put(str, 1);
                    c4961.f16411.put(str, Long.valueOf(j));
                } else {
                    C3610 c3610 = ((C5371) c4961.f18660).f17717;
                    C5371.m9020(c3610);
                    c3610.f12022.m9432("Too many ads visible");
                }
                break;
            default:
                c4961.mo6517();
                AbstractC0487.m1090(str);
                C4461 c4462 = c4961.f16409;
                Integer num2 = (Integer) c4462.get(str);
                C5371 c5371 = (C5371) c4961.f18660;
                if (num2 == null) {
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9430(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    C5266 c5266 = c5371.f17711;
                    C3610 c3612 = c5371.f17717;
                    C5371.m9023(c5266);
                    C0932 c0932M8902 = c5266.m8902(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c4462.put(str, Integer.valueOf(iIntValue));
                    } else {
                        c4462.remove(str);
                        C4461 c4463 = c4961.f16411;
                        Long l = (Long) c4463.get(str);
                        if (l == null) {
                            C5371.m9020(c3612);
                            c3612.f12020.m9432("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            c4463.remove(str);
                            c4961.m8342(str, jLongValue, c0932M8902);
                        }
                        if (c4462.isEmpty()) {
                            long j2 = c4961.f16410;
                            if (j2 != 0) {
                                c4961.m8341(j - j2, c0932M8902);
                                c4961.f16410 = 0L;
                            } else {
                                C5371.m9020(c3612);
                                c3612.f12020.m9432("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
