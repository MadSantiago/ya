package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: renamed from: ۦًٜؒۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3652 extends AbstractC0071 {
    public static final Parcelable.Creator<C3652> CREATOR = new C1432(23);

    /* JADX INFO: renamed from: ۥْ */
    public final int f12216;

    /* JADX INFO: renamed from: ۥٓ */
    public final GoogleSignInAccount f12217;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Account f12218;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f12219;

    public C3652(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f12219 = i;
        this.f12218 = account;
        this.f12216 = i2;
        this.f12217 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f12219);
        AbstractC4489.m7793(parcel, 2, this.f12218, i);
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(this.f12216);
        AbstractC4489.m7793(parcel, 4, this.f12217, i);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
