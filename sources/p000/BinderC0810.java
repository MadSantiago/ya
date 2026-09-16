package p000;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: ۥؚٕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0810 extends AbstractBinderC1892 implements InterfaceC0257 {

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC4264 f2882;

    public BinderC0810(InterfaceC4264 interfaceC4264) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f2882 = interfaceC4264;
    }

    @Override // p000.InterfaceC0257
    /* JADX INFO: renamed from: ۥُ */
    public final int mo537() {
        return System.identityHashCode(this.f2882);
    }

    @Override // p000.AbstractBinderC1892
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo479(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f2882);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) AbstractC5564.m9346(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        AbstractC5564.m9347(parcel);
        mo538(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }

    @Override // p000.InterfaceC0257
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo538(String str, String str2, Bundle bundle, long j) {
        this.f2882.mo4010(str, str2, bundle, j);
    }
}
