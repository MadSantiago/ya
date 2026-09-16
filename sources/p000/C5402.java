package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦ۠ؕؓٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5402 extends AbstractC2797 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ int f17844;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ Object f17845;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ Object f17846;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5402(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f17844 = i;
        this.f17845 = obj;
        this.f17846 = obj2;
    }

    @Override // p000.AbstractC2797
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo583() {
        int i;
        long jM3789;
        C0498[] c0498Arr;
        switch (this.f17844) {
            case 0:
                ((C0127) this.f17845).f531.mo3753((C1928) ((C5450) this.f17846).f17965);
                return -1L;
            case 1:
                try {
                    ((C0127) this.f17845).f531.mo3752((C0498) this.f17846);
                    break;
                } catch (IOException e) {
                    C3216 c3216 = C3216.f10772;
                    C3216 c3217 = C3216.f10772;
                    String str = "Http2Connection.Listener failure for " + ((C0127) this.f17845).f512;
                    c3217.getClass();
                    C3216.m5903(4, str, e);
                    try {
                        ((C0498) this.f17846).m1108(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                C0715 c0715 = (C0715) this.f17845;
                C1928 c1928 = (C1928) this.f17846;
                C5450 c5450 = new C5450();
                C0127 c0127 = c0715.f2619;
                synchronized (c0127.f524) {
                    synchronized (c0127) {
                        try {
                            C1928 c1929 = c0127.f514;
                            C1928 c19210 = new C1928();
                            i = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & c1929.f6354) != 0) {
                                    c19210.m3788(i2, c1929.f6353[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & c1928.f6354) != 0) {
                                    c19210.m3788(i3, c1928.f6353[i3]);
                                }
                            }
                            c5450.f17965 = c19210;
                            jM3789 = ((long) c19210.m3789()) - ((long) c1929.m3789());
                            c0498Arr = (jM3789 == 0 || c0127.f530.isEmpty()) ? null : (C0498[]) c0127.f530.values().toArray(new C0498[0]);
                            c0127.f514 = (C1928) c5450.f17965;
                            c0127.f525.m4367(new C5402(c0127.f512 + " onSettings", c0127, c5450, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c0127.f524.m5834((C1928) c5450.f17965);
                    } catch (IOException e2) {
                        c0127.m277(2, 2, e2);
                    }
                    break;
                }
                if (c0498Arr != null) {
                    int length = c0498Arr.length;
                    while (i < length) {
                        C0498 c0498 = c0498Arr[i];
                        synchronized (c0498) {
                            c0498.f1796 += jM3789;
                            if (jM3789 > 0) {
                                c0498.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
