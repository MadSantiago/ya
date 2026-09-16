package p000;

/* JADX INFO: renamed from: ۦَؙؓۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3537 extends AbstractC4821 {

    /* JADX INFO: renamed from: ۥٓ */
    public final transient Object f11743;

    public C3537(Object obj) {
        obj.getClass();
        this.f11743 = obj;
    }

    @Override // p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f11743.equals(obj);
    }

    @Override // p000.AbstractC4821, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11743.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f11743.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    @Override // p000.AbstractC4821, p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4822 mo4834() {
        C1868 c1868 = AbstractC4822.f15887;
        Object[] objArr = {this.f11743};
        AbstractC3831.m6883(1, objArr);
        return AbstractC4822.m8197(1, objArr);
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return false;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1603(Object[] objArr) {
        objArr[0] = this.f11743;
        return 1;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0219 iterator() {
        return new C2327(this.f11743);
    }
}
