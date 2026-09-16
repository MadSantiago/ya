package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦٌٍّؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3739 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f12454;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C4461 f12455;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f12456 = -1;

    /* JADX INFO: renamed from: ۦۨ */
    public int f12457;

    public C3739(C4461 c4461) {
        this.f12455 = c4461;
        this.f12457 = c4461.f2862 - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f12454) {
            C1078.m2276("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f12456;
            C4461 c4461 = this.f12455;
            if (AbstractC3831.m6874(key, c4461.m1694(i)) && AbstractC3831.m6874(entry.getValue(), c4461.m1697(this.f12456))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f12454) {
            return this.f12455.m1694(this.f12456);
        }
        C1078.m2276("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f12454) {
            return this.f12455.m1697(this.f12456);
        }
        C1078.m2276("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12456 < this.f12457;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f12454) {
            C1078.m2276("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f12456;
        C4461 c4461 = this.f12455;
        Object objM1694 = c4461.m1694(i);
        Object objM1697 = c4461.m1697(this.f12456);
        return (objM1694 == null ? 0 : objM1694.hashCode()) ^ (objM1697 != null ? objM1697.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        this.f12456++;
        this.f12454 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12454) {
            throw new IllegalStateException();
        }
        this.f12455.m1695(this.f12456);
        this.f12456--;
        this.f12457--;
        this.f12454 = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f12454) {
            return this.f12455.m1700(this.f12456, obj);
        }
        C1078.m2276("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
