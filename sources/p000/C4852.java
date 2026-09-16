package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦٟؔؒۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4852 extends AbstractC2975 implements Parcelable, InterfaceC5910 {
    public static final Parcelable.Creator<C4852> CREATOR = new C0589(0);

    /* JADX INFO: renamed from: ۥْ */
    public C1853 f15971;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC0241 f15972;

    public C4852(Object obj, InterfaceC0241 interfaceC0241) {
        this.f15972 = interfaceC0241;
        AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
        C1853 c1853 = new C1853(abstractC3191M3278.mo5118(), obj);
        if (!(abstractC3191M3278 instanceof C2388)) {
            c1853.f16355 = new C1853(1L, obj);
        }
        this.f15971 = c1853;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        return ((C1853) AbstractC1538.m3270(this.f15971, this)).f6193;
    }

    @Override // p000.InterfaceC4367
    public final void setValue(Object obj) {
        AbstractC3191 abstractC3191M3278;
        C1853 c1853 = (C1853) AbstractC1538.m3272(this.f15971);
        if (this.f15972.mo502(c1853.f6193, obj)) {
            return;
        }
        C1853 c1854 = this.f15971;
        synchronized (AbstractC1538.f5203) {
            abstractC3191M3278 = AbstractC1538.m3278();
            ((C1853) AbstractC1538.m3288(c1854, this, abstractC3191M3278, c1853)).f6193 = obj;
        }
        AbstractC1538.m3281(abstractC3191M3278, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C1853) AbstractC1538.m3272(this.f15971)).f6193 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C0373 c0373 = C0373.f1364;
        InterfaceC0241 interfaceC0241 = this.f15972;
        if (interfaceC0241.equals(c0373)) {
            i2 = 0;
        } else if (interfaceC0241.equals(C1298.f4439)) {
            i2 = 1;
        } else {
            if (!interfaceC0241.equals(C1397.f4792)) {
                C1078.m2276("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    @Override // p000.InterfaceC4367
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo353() {
        return getValue();
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥُ */
    public final void mo354(AbstractC4937 abstractC4937) {
        this.f15971 = (C1853) abstractC4937;
    }

    @Override // p000.InterfaceC5910
    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC0241 mo355() {
        return this.f15972;
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4937 mo356() {
        return this.f15971;
    }

    @Override // p000.InterfaceC4367
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 mo357() {
        return new C4884(13, this);
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC4937 mo358(AbstractC4937 abstractC4937, AbstractC4937 abstractC4938, AbstractC4937 abstractC4939) {
        if (this.f15972.mo502(((C1853) abstractC4938).f6193, ((C1853) abstractC4939).f6193)) {
            return abstractC4938;
        }
        return null;
    }
}
