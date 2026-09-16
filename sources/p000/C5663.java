package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦٌّۤؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5663 extends C2632 {

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ int f18632;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5663(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f18632 = i;
    }

    @Override // p000.C2632
    /* JADX INFO: renamed from: ۥۗ */
    public void mo4951(Object obj, C5408 c5408) {
        switch (this.f18632) {
            case 1:
                C5324 c5324 = (C5324) obj;
                if (c5324 != null) {
                    C1354 c1354 = c5324.f17570.f17954;
                    c1354.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < c1354.m2863() - c1354.m2862())) {
                            break;
                        } else if (i >= c1354.m2863() - c1354.m2862()) {
                            C0178.m381();
                            break;
                        } else {
                            C5441 c5441 = c1354.f4658;
                            int iM2862 = c1354.m2862() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) c5441.f17957[iM2862];
                            if (((Set) entry.getValue()).isEmpty()) {
                                c5408.m9090(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    c5408.m9090(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.mo4951(obj, c5408);
                break;
        }
    }

    @Override // p000.C2632
    /* JADX INFO: renamed from: ۥۣ */
    public void mo4952(Iterator it, C5408 c5408) {
        switch (this.f18632) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.f8744;
                    if (!zHasNext) {
                        c5408.m9090(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        c5408.m9090(sb.toString(), str);
                    }
                }
                break;
            default:
                super.mo4952(it, c5408);
                break;
        }
    }
}
