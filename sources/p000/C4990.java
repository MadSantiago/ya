package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: ۦَّۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4990 extends AbstractC0071 {
    public static final Parcelable.Creator<C4990> CREATOR = new C5229(17);

    /* JADX INFO: renamed from: ۥً */
    public static final Scope[] f16500 = new Scope[0];

    /* JADX INFO: renamed from: ۦٚ */
    public static final C2274[] f16501 = new C2274[0];

    /* JADX INFO: renamed from: ۥؓ */
    public final boolean f16502;

    /* JADX INFO: renamed from: ۥؖ */
    public final int f16503;

    /* JADX INFO: renamed from: ۥَ */
    public IBinder f16504;

    /* JADX INFO: renamed from: ۥْ */
    public final int f16505;

    /* JADX INFO: renamed from: ۥٓ */
    public String f16506;

    /* JADX INFO: renamed from: ۥٖ */
    public Scope[] f16507;

    /* JADX INFO: renamed from: ۥٙ */
    public final boolean f16508;

    /* JADX INFO: renamed from: ۥۖ */
    public C2274[] f16509;

    /* JADX INFO: renamed from: ۥۧ */
    public final String f16510;

    /* JADX INFO: renamed from: ۦٕ */
    public C2274[] f16511;

    /* JADX INFO: renamed from: ۦٗ */
    public Bundle f16512;

    /* JADX INFO: renamed from: ۦۛ */
    public Account f16513;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f16514;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f16515;

    public C4990(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2274[] c2274Arr, C2274[] c2274Arr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f16500 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C2274[] c2274Arr3 = f16501;
        C2274[] c2274Arr4 = c2274Arr == null ? c2274Arr3 : c2274Arr;
        c2274Arr3 = c2274Arr2 != null ? c2274Arr2 : c2274Arr3;
        this.f16515 = i;
        this.f16514 = i2;
        this.f16505 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f16506 = "com.google.android.gms";
        } else {
            this.f16506 = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = AbstractBinderC4339.f14321;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC4814 c5331 = iInterfaceQueryLocalInterface instanceof InterfaceC4814 ? (InterfaceC4814) iInterfaceQueryLocalInterface : new C5331(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        C5331 c5332 = (C5331) c5331;
                        Parcel parcelM7508 = c5332.m7508(c5332.m7504(), 2);
                        Account account3 = (Account) AbstractC3419.m6199(parcelM7508, Account.CREATOR);
                        parcelM7508.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.f16504 = iBinder;
            account2 = account;
        }
        this.f16513 = account2;
        this.f16507 = scopeArr2;
        this.f16512 = bundle2;
        this.f16509 = c2274Arr4;
        this.f16511 = c2274Arr3;
        this.f16508 = z;
        this.f16503 = i4;
        this.f16502 = z2;
        this.f16510 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C5229.m8860(this, parcel, i);
    }
}
