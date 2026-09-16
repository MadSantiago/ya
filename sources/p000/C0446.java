package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۥۣؕؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0446 extends AbstractC0072 {

    /* JADX INFO: renamed from: ۥَ */
    public final C0446 f1633;

    /* JADX INFO: renamed from: ۥٖ */
    public ArrayList f1634;

    public C0446(String str, int i, Map map, C0446 c0446) {
        super(str, i, map);
        this.f1633 = c0446;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockImpl{name='");
        sb.append((String) this.f13680);
        sb.append("', start=");
        sb.append(this.f13683);
        sb.append(", end=");
        sb.append(this.f13682);
        sb.append(", attributes=");
        sb.append((Map) this.f13681);
        sb.append(", parent=");
        C0446 c0446 = this.f1633;
        sb.append(c0446 != null ? (String) c0446.f13680 : null);
        sb.append(", children=");
        sb.append(this.f1634);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ۦؑ */
    public final Map mo968() {
        return (Map) this.f13681;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m969(int i) {
        if (m7287()) {
            return;
        }
        this.f13682 = i;
        ArrayList arrayList = this.f1634;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0446) it.next()).m969(i);
            }
        }
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ۦِ */
    public final boolean mo970() {
        return true;
    }

    @Override // p000.AbstractC0072
    /* JADX INFO: renamed from: ۥۜ */
    public final C0446 mo967() {
        return this;
    }
}
