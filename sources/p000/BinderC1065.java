package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: renamed from: ۥُؖۜٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1065 extends AbstractBinderC0543 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f3746;

    /* JADX INFO: renamed from: ۦ۟ */
    public AbstractC4150 f3747;

    public BinderC1065(AbstractC4150 abstractC4150, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f3747 = abstractC4150;
        this.f3746 = i;
    }

    @Override // p000.AbstractBinderC0543
    /* JADX INFO: renamed from: ۥٍ */
    public final boolean mo1238(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC3419.m6199(parcel, Bundle.CREATOR);
            AbstractC3419.m6197(parcel);
            AbstractC0487.m1048(this.f3747, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC4150 abstractC4150 = this.f3747;
            int i3 = this.f3746;
            abstractC4150.getClass();
            C5072 c5072 = new C5072(abstractC4150, i2, strongBinder, bundle);
            HandlerC1711 handlerC1711 = abstractC4150.f13816;
            handlerC1711.sendMessage(handlerC1711.obtainMessage(1, i3, -1, c5072));
            this.f3747 = null;
        } else if (i == 2) {
            parcel.readInt();
            AbstractC3419.m6197(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            C3202 c3202 = (C3202) AbstractC3419.m6199(parcel, C3202.CREATOR);
            AbstractC3419.m6197(parcel);
            AbstractC4150 abstractC4151 = this.f3747;
            AbstractC0487.m1048(abstractC4151, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC0487.m1047(c3202);
            abstractC4151.f13823 = c3202;
            Bundle bundle2 = c3202.f10747;
            AbstractC0487.m1048(this.f3747, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC4150 abstractC4152 = this.f3747;
            int i5 = this.f3746;
            abstractC4152.getClass();
            C5072 c5073 = new C5072(abstractC4152, i4, strongBinder2, bundle2);
            HandlerC1711 handlerC1712 = abstractC4152.f13816;
            handlerC1712.sendMessage(handlerC1712.obtainMessage(1, i5, -1, c5073));
            this.f3747 = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
