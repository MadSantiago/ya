package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥؑؑۙۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0169 extends AbstractC2975 implements Parcelable, InterfaceC5910, InterfaceC5372, InterfaceC4367 {
    public static final Parcelable.Creator<C0169> CREATOR = new C1432(15);

    /* JADX INFO: renamed from: ۦ۟ */
    public C1055 f629;

    public C0169(int i) {
        AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
        C1055 c1055 = new C1055(abstractC3191M3278.mo5118(), i);
        if (!(abstractC3191M3278 instanceof C2388)) {
            c1055.f16355 = new C1055(1L, i);
        }
        this.f629 = c1055;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        return Integer.valueOf(m360());
    }

    @Override // p000.InterfaceC4367
    public final void setValue(Object obj) {
        m359(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((C1055) AbstractC1538.m3272(this.f629)).f3726 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(m360());
    }

    @Override // p000.InterfaceC4367
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo353() {
        return Integer.valueOf(m360());
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥُ */
    public final void mo354(AbstractC4937 abstractC4937) {
        this.f629 = (C1055) abstractC4937;
    }

    @Override // p000.InterfaceC5910
    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC0241 mo355() {
        return C1298.f4439;
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4937 mo356() {
        return this.f629;
    }

    @Override // p000.InterfaceC4367
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 mo357() {
        return new C4884(11, this);
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC4937 mo358(AbstractC4937 abstractC4937, AbstractC4937 abstractC4938, AbstractC4937 abstractC4939) {
        if (((C1055) abstractC4938).f3726 == ((C1055) abstractC4939).f3726) {
            return abstractC4938;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m359(int i) {
        AbstractC3191 abstractC3191M3278;
        C1055 c1055 = (C1055) AbstractC1538.m3272(this.f629);
        if (c1055.f3726 != i) {
            C1055 c1056 = this.f629;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                ((C1055) AbstractC1538.m3288(c1056, this, abstractC3191M3278, c1055)).f3726 = i;
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final int m360() {
        return ((C1055) AbstractC1538.m3270(this.f629, this)).f3726;
    }
}
