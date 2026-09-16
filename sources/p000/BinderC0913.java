package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: renamed from: ۥٌؖۧٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0913 extends AbstractBinderC0543 implements InterfaceC1895, InterfaceC3785 {

    /* JADX INFO: renamed from: ۥۖ */
    public static final C2341 f3277 = AbstractC3100.f10393;

    /* JADX INFO: renamed from: ۥَ */
    public final Set f3278;

    /* JADX INFO: renamed from: ۥْ */
    public final Handler f3279;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2341 f3280;

    /* JADX INFO: renamed from: ۥٖ */
    public final C2813 f3281;

    /* JADX INFO: renamed from: ۦٗ */
    public C5719 f3282;

    /* JADX INFO: renamed from: ۦۛ */
    public C2566 f3283;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Context f3284;

    public BinderC0913(Context context, HandlerC0645 handlerC0645, C2813 c2813) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f3284 = context;
        this.f3279 = handlerC0645;
        this.f3281 = c2813;
        this.f3278 = (Set) c2813.f9393;
        this.f3280 = f3277;
    }

    @Override // p000.InterfaceC1895
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1895() {
        GoogleSignInAccount googleSignInAccountM113;
        C5719 c5719 = this.f3282;
        c5719.getClass();
        boolean z = false;
        try {
            c5719.f18824.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = c5719.f13813;
                ReentrantLock reentrantLock = C5166.f17103;
                AbstractC0487.m1047(context);
                ReentrantLock reentrantLock2 = C5166.f17103;
                reentrantLock2.lock();
                try {
                    C5166 c5166 = C5166.f17104;
                    if (c5166 == null) {
                        c5166 = new C5166(context.getApplicationContext());
                        C5166.f17104 = c5166;
                    }
                    reentrantLock2.unlock();
                    String strM8774 = c5166.m8774("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strM8774)) {
                        String strM8775 = c5166.m8774("googleSignInAccount:" + strM8774);
                        if (strM8775 != null) {
                            try {
                                googleSignInAccountM113 = GoogleSignInAccount.m113(strM8775);
                            } catch (JSONException unused) {
                                googleSignInAccountM113 = null;
                            }
                        }
                    }
                    googleSignInAccountM113 = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountM113 = null;
            }
            Integer num = c5719.f18822;
            AbstractC0487.m1047(num);
            C3652 c3652 = new C3652(2, account, num.intValue(), googleSignInAccountM113);
            C5071 c5071 = (C5071) c5719.m7333();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c5071.f14081);
            int i = AbstractC2694.f8937;
            parcelObtain.writeInt(1);
            int iM7800 = AbstractC4489.m7800(parcelObtain, 20293);
            AbstractC4489.m7797(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            AbstractC4489.m7793(parcelObtain, 2, c3652, 0);
            AbstractC4489.m7790(parcelObtain, iM7800);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                c5071.f14082.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f3279.post(new RunnableC4985(17, this, new C2209(1, new C2612(8, null, null), null), z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // p000.InterfaceC3785
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1896(C2612 c2612) {
        this.f3283.m4839(c2612);
    }

    @Override // p000.InterfaceC1895
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1897(int i) {
        C2566 c2566 = this.f3283;
        C3184 c3184 = (C3184) ((C4085) c2566.f8567).f13635.get((C5001) c2566.f8565);
        if (c3184 != null) {
            if (c3184.f10698) {
                c3184.m5863(new C2612(17, null, null));
            } else {
                c3184.mo1897(i);
            }
        }
    }
}
