package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ۦٔؑؐۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4150 {

    /* JADX INFO: renamed from: ۦٖ */
    public static final C2274[] f13808 = new C2274[0];

    /* JADX INFO: renamed from: ۥؓ */
    public ServiceConnectionC1699 f13809;

    /* JADX INFO: renamed from: ۥً */
    public final InterfaceC0500 f13811;

    /* JADX INFO: renamed from: ۥَ */
    public final C0600 f13812;

    /* JADX INFO: renamed from: ۥْ */
    public final Context f13813;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3827 f13814;

    /* JADX INFO: renamed from: ۥٕ */
    public final int f13815;

    /* JADX INFO: renamed from: ۥٖ */
    public final HandlerC1711 f13816;

    /* JADX INFO: renamed from: ۥٙ */
    public IInterface f13817;

    /* JADX INFO: renamed from: ۥۖ */
    public C5205 f13818;

    /* JADX INFO: renamed from: ۥۙ */
    public final String f13819;

    /* JADX INFO: renamed from: ۦؙ */
    public volatile String f13824;

    /* JADX INFO: renamed from: ۦٕ */
    public InterfaceC3151 f13826;

    /* JADX INFO: renamed from: ۦٚ */
    public final InterfaceC2023 f13828;

    /* JADX INFO: renamed from: ۦ۟ */
    public C0946 f13830;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile String f13831 = null;

    /* JADX INFO: renamed from: ۦٗ */
    public final Object f13827 = new Object();

    /* JADX INFO: renamed from: ۦۛ */
    public final Object f13829 = new Object();

    /* JADX INFO: renamed from: ۥؖ */
    public final ArrayList f13810 = new ArrayList();

    /* JADX INFO: renamed from: ۥۧ */
    public int f13821 = 1;

    /* JADX INFO: renamed from: ۦؖ */
    public C2612 f13822 = null;

    /* JADX INFO: renamed from: ۥۦ */
    public boolean f13820 = false;

    /* JADX INFO: renamed from: ۦؗ */
    public volatile C3202 f13823 = null;

    /* JADX INFO: renamed from: ۦُ */
    public final AtomicInteger f13825 = new AtomicInteger(0);

    public AbstractC4150(Context context, Looper looper, C3827 c3827, C0600 c0600, int i, InterfaceC0500 interfaceC0500, InterfaceC2023 interfaceC2023, String str) {
        AbstractC0487.m1048(context, "Context must not be null");
        this.f13813 = context;
        AbstractC0487.m1048(looper, "Looper must not be null");
        AbstractC0487.m1048(c3827, "Supervisor must not be null");
        this.f13814 = c3827;
        AbstractC0487.m1048(c0600, "API availability must not be null");
        this.f13812 = c0600;
        this.f13816 = new HandlerC1711(this, looper);
        this.f13815 = i;
        this.f13811 = interfaceC0500;
        this.f13828 = interfaceC2023;
        this.f13819 = str;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m7329(C2391 c2391) {
        ((C3184) c2391.f7924).f10692.f13634.post(new RunnableC3365(14, c2391));
    }

    /* JADX INFO: renamed from: ۥَ */
    public Set mo7255() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract int mo4540();

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m7330() {
        boolean z;
        synchronized (this.f13827) {
            int i = this.f13821;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥْ */
    public C2274[] mo7331() {
        return f13808;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public Bundle mo7332() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final IInterface m7333() {
        IInterface iInterface;
        synchronized (this.f13827) {
            try {
                if (this.f13821 == 5) {
                    throw new DeadObjectException();
                }
                if (!m7337()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f13817;
                AbstractC0487.m1048(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m7334(int i, IInterface iInterface) {
        C0946 c0946;
        AbstractC0487.m1088((i == 4) == (iInterface != null));
        synchronized (this.f13827) {
            try {
                this.f13821 = i;
                this.f13817 = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    ServiceConnectionC1699 serviceConnectionC1699 = this.f13809;
                    if (serviceConnectionC1699 != null) {
                        C3827 c3827 = this.f13814;
                        String str = this.f13830.f3351;
                        AbstractC0487.m1047(str);
                        this.f13830.getClass();
                        if (this.f13819 == null) {
                            this.f13813.getClass();
                        }
                        c3827.m6821(str, serviceConnectionC1699, this.f13830.f3352);
                        this.f13809 = null;
                    }
                } else if (i == 2 || i == 3) {
                    ServiceConnectionC1699 serviceConnectionC16910 = this.f13809;
                    if (serviceConnectionC16910 != null && (c0946 = this.f13830) != null) {
                        String str2 = c0946.f3351;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        C3827 c3828 = this.f13814;
                        String str3 = this.f13830.f3351;
                        AbstractC0487.m1047(str3);
                        this.f13830.getClass();
                        if (this.f13819 == null) {
                            this.f13813.getClass();
                        }
                        c3828.m6821(str3, serviceConnectionC16910, this.f13830.f3352);
                        this.f13825.incrementAndGet();
                    }
                    ServiceConnectionC1699 serviceConnectionC16911 = new ServiceConnectionC1699(this, this.f13825.get());
                    this.f13809 = serviceConnectionC16911;
                    String strMo4543 = mo4543();
                    boolean zMo7335 = mo7335();
                    this.f13830 = new C0946(2, strMo4543, zMo7335);
                    if (zMo7335 && mo4540() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f13830.f3351)));
                    }
                    C3827 c3829 = this.f13814;
                    String str4 = this.f13830.f3351;
                    AbstractC0487.m1047(str4);
                    this.f13830.getClass();
                    String name = this.f13819;
                    if (name == null) {
                        name = this.f13813.getClass().getName();
                    }
                    C2612 c2612M6822 = c3829.m6822(new C5148(str4, this.f13830.f3352), serviceConnectionC16911, name, null);
                    if (!(c2612M6822.f8713 == 0)) {
                        String str5 = this.f13830.f3351;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = c2612M6822.f8713;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (c2612M6822.f8711 != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c2612M6822.f8711);
                        }
                        int i3 = this.f13825.get();
                        C0947 c0947 = new C0947(this, i2, bundle);
                        HandlerC1711 handlerC1711 = this.f13816;
                        handlerC1711.sendMessage(handlerC1711.obtainMessage(7, i3, -1, c0947));
                    }
                } else if (i == 4) {
                    AbstractC0487.m1047(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public boolean mo7335() {
        return mo4540() >= 211700000;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m7336() {
        if (!m7337() || this.f13830 == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m7337() {
        boolean z;
        synchronized (this.f13827) {
            z = this.f13821 == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m7338(String str) {
        this.f13831 = str;
        m7345();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦؚ */
    public final void m7339(InterfaceC4814 interfaceC4814, Set set) {
        Bundle bundleMo7332 = mo7332();
        String str = this.f13824;
        int i = this.f13815;
        int i2 = C0600.f2226;
        Scope[] scopeArr = C4990.f16500;
        Bundle bundle = new Bundle();
        C2274[] c2274Arr = C4990.f16501;
        C4990 c4990 = new C4990(6, i, i2, null, null, scopeArr, bundle, null, c2274Arr, c2274Arr, true, 0, false, str);
        c4990.f16506 = this.f13813.getPackageName();
        c4990.f16512 = bundleMo7332;
        if (set != null) {
            c4990.f16507 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo1833()) {
            Account accountMo7256 = mo7256();
            if (accountMo7256 == null) {
                accountMo7256 = new Account("<<default account>>", "com.google");
            }
            c4990.f16513 = accountMo7256;
            if (interfaceC4814 != 0) {
                c4990.f16504 = ((AbstractC4249) interfaceC4814).f14082;
            }
        }
        c4990.f16509 = f13808;
        c4990.f16511 = mo7331();
        try {
            synchronized (this.f13829) {
                try {
                    C5205 c5205 = this.f13818;
                    if (c5205 != null) {
                        c5205.m8805(new BinderC1065(this, this.f13825.get()), c4990);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.f13825.get();
            HandlerC1711 handlerC1711 = this.f13816;
            handlerC1711.sendMessage(handlerC1711.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.f13825.get();
            C5072 c5072 = new C5072(this, 8, null, null);
            HandlerC1711 handlerC1712 = this.f13816;
            handlerC1712.sendMessage(handlerC1712.obtainMessage(1, i4, -1, c5072));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.f13825.get();
            C5072 c5073 = new C5072(this, 8, null, null);
            HandlerC1711 handlerC1713 = this.f13816;
            handlerC1713.sendMessage(handlerC1713.obtainMessage(1, i5, -1, c5073));
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m7340() {
        int iM1308 = this.f13812.m1308(this.f13813, mo4540());
        if (iM1308 == 0) {
            m7343(new C5086(this));
            return;
        }
        m7334(1, null);
        this.f13826 = new C5086(this);
        int i = this.f13825.get();
        HandlerC1711 handlerC1711 = this.f13816;
        handlerC1711.sendMessage(handlerC1711.obtainMessage(3, i, iM1308, null));
    }

    /* JADX INFO: renamed from: ۦِ */
    public final String m7341() {
        return this.f13831;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ boolean m7342(int i, int i2, IInterface iInterface) {
        synchronized (this.f13827) {
            try {
                if (this.f13821 != i) {
                    return false;
                }
                m7334(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public abstract String mo4541();

    /* JADX INFO: renamed from: ۦٛ */
    public final void m7343(InterfaceC3151 interfaceC3151) {
        this.f13826 = interfaceC3151;
        m7334(2, null);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public boolean mo1833() {
        return false;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C2274[] m7344() {
        C3202 c3202 = this.f13823;
        if (c3202 == null) {
            return null;
        }
        return c3202.f10746;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public abstract IInterface mo4542(IBinder iBinder);

    /* JADX INFO: renamed from: ۦۛ */
    public abstract String mo4543();

    /* JADX INFO: renamed from: ۦ۟ */
    public Account mo7256() {
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m7345() {
        this.f13825.incrementAndGet();
        ArrayList arrayList = this.f13810;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AbstractC2511 abstractC2511 = (AbstractC2511) arrayList.get(i);
                    synchronized (abstractC2511) {
                        abstractC2511.f8335 = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f13829) {
            this.f13818 = null;
        }
        m7334(1, null);
    }
}
