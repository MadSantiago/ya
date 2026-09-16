package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥؚٜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2351 extends AbstractC4878 {

    /* JADX INFO: renamed from: ۥۖ */
    public List f7797;

    /* JADX INFO: renamed from: ۦٕ */
    public AbstractC3925 f7798;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f7799;

    public /* synthetic */ C2351(int i) {
        this.f7799 = i;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public void m4422(InterfaceC4745 interfaceC4745) {
        C0637 c0637 = new C0637();
        interfaceC4745.mo211(c0637);
        this.f7798 = c0637;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public void m4423(String... strArr) {
        this.f7797 = AbstractC0246.m509(strArr);
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        int iM3958;
        int iM3956;
        switch (this.f7799) {
            case 0:
                List list = this.f7797;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC5573.m9402(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(c2024.m3946((String) it.next())));
                    }
                    iM3958 = c2024.m3958(AbstractC0973.m2050(arrayList));
                } else {
                    iM3958 = 0;
                }
                C2672 c2672 = (C2672) this.f7798;
                int iMo1447 = c2672 != null ? c2672.mo1447(c2024) : 0;
                c2024.m3948(6);
                c2024.m3952(5, iMo1447);
                c2024.m3952(3, 0);
                c2024.m3952(1, 0);
                c2024.m3952(0, iM3958);
                int iM3950 = c2024.m3950();
                c2024.m3955(iM3950);
                return iM3950;
            default:
                C3728<C1046> c3728 = (C3728) this.f7797;
                if (c3728 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(c3728, 10));
                    for (C1046 c1046 : c3728) {
                        int i = c1046.f15339;
                        if (i < 0) {
                            C1078.m2276("not has id");
                            return 0;
                        }
                        arrayList2.add(Long.valueOf((((long) c1046.f15338) << 32) | ((long) i)));
                    }
                    long[] jArrM2041 = AbstractC0973.m2041(arrayList2);
                    c2024.m3944(8, jArrM2041.length, 8);
                    for (int length = jArrM2041.length - 1; -1 < length; length--) {
                        long j = jArrM2041[length];
                        c2024.m3954(8, 0);
                        ByteBuffer byteBuffer = (ByteBuffer) c2024.f6672;
                        int i2 = c2024.f6668 - 8;
                        c2024.f6668 = i2;
                        byteBuffer.putLong(i2, j);
                    }
                    iM3956 = c2024.m3956();
                } else {
                    iM3956 = 0;
                }
                C0637 c0637 = (C0637) this.f7798;
                int iMo1448 = c0637 != null ? c0637.mo1447(c2024) : 0;
                c2024.m3948(7);
                c2024.m3952(6, iMo1448);
                c2024.m3952(4, 0);
                c2024.m3952(3, iM3956);
                c2024.m3952(1, 0);
                c2024.m3952(0, 0);
                int iM3951 = c2024.m3950();
                c2024.m3955(iM3951);
                return iM3951;
        }
    }

    /* JADX INFO: renamed from: ۦۣ */
    public void m4424(InterfaceC4745 interfaceC4745) {
        C2672 c2672 = new C2672();
        interfaceC4745.mo211(c2672);
        this.f7798 = c2672;
    }
}
