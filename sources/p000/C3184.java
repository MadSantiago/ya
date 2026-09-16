package p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: ۦٜؓؖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3184 implements InterfaceC1895, InterfaceC3785 {

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ C4085 f10692;

    /* JADX INFO: renamed from: ۥْ */
    public final C5001 f10694;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2346 f10695;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f10698;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f10700;

    /* JADX INFO: renamed from: ۦۛ */
    public final BinderC0913 f10701;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC0858 f10702;

    /* JADX INFO: renamed from: ۦۨ */
    public final LinkedList f10703 = new LinkedList();

    /* JADX INFO: renamed from: ۥَ */
    public final HashSet f10693 = new HashSet();

    /* JADX INFO: renamed from: ۥٖ */
    public final HashMap f10696 = new HashMap();

    /* JADX INFO: renamed from: ۦٕ */
    public final ArrayList f10699 = new ArrayList();

    /* JADX INFO: renamed from: ۥٙ */
    public C2612 f10697 = null;

    /* JADX WARN: Multi-variable type inference failed */
    public C3184(C4085 c4085, AbstractC4501 abstractC4501) {
        this.f10692 = c4085;
        Looper looper = c4085.f13634.getLooper();
        C2808 c2808M7830 = abstractC4501.m7830();
        C2813 c2813 = new C2813((C1821) c2808M7830.f9378, (String) c2808M7830.f9376, (String) c2808M7830.f9377);
        InterfaceC0858 interfaceC0858Mo4390 = ((AbstractC3831) abstractC4501.f14876.f16551).mo4390(abstractC4501.f14881, looper, c2813, abstractC4501.f14882, this, this);
        String str = abstractC4501.f14879;
        if (str != null && (interfaceC0858Mo4390 instanceof AbstractC4150)) {
            ((AbstractC4150) interfaceC0858Mo4390).f13824 = str;
        }
        if (str != null && (interfaceC0858Mo4390 instanceof AbstractServiceConnectionC0779)) {
            AbstractC2049.m4001(interfaceC0858Mo4390);
            throw null;
        }
        this.f10702 = interfaceC0858Mo4390;
        this.f10694 = abstractC4501.f14877;
        this.f10695 = new C2346(20);
        this.f10700 = abstractC4501.f14884;
        if (!interfaceC0858Mo4390.mo1833()) {
            this.f10701 = null;
            return;
        }
        Context context = c4085.f13627;
        HandlerC0645 handlerC0645 = c4085.f13634;
        C2808 c2808M7831 = abstractC4501.m7830();
        this.f10701 = new BinderC0913(context, handlerC0645, new C2813((C1821) c2808M7831.f9378, (String) c2808M7831.f9376, (String) c2808M7831.f9377));
    }

    @Override // p000.InterfaceC1895
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1895() {
        Looper looperMyLooper = Looper.myLooper();
        HandlerC0645 handlerC0645 = this.f10692.f13634;
        if (looperMyLooper == handlerC0645.getLooper()) {
            m5870();
        } else {
            handlerC0645.post(new RunnableC3365(13, this));
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m5861(C2612 c2612) {
        HashSet hashSet = this.f10693;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            C0178.m382();
        } else {
            if (AbstractC2164.m4207(c2612, C2612.f8709)) {
                this.f10702.m1827();
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m5862(Status status) {
        AbstractC0487.m1077(this.f10692.f13634);
        m5872(status, null, false);
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m5863(C2612 c2612) {
        AbstractC0487.m1077(this.f10692.f13634);
        InterfaceC0858 interfaceC0858 = this.f10702;
        interfaceC0858.m1829("onSignInFailed for " + interfaceC0858.getClass().getName() + " with " + String.valueOf(c2612));
        m5874(c2612, null);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m5864() {
        AbstractC0487.m1077(this.f10692.f13634);
        Status status = C4085.f13625;
        m5862(status);
        this.f10695.m4395(false, status);
        for (C0488 c0488 : (C0488[]) this.f10696.keySet().toArray(new C0488[0])) {
            m5875(new C1664(c0488, new C2332()));
        }
        m5861(new C2612(4, null, null));
        InterfaceC0858 interfaceC0858 = this.f10702;
        if (interfaceC0858.m1828()) {
            interfaceC0858.m1823(new C2391(3, this));
        }
    }

    @Override // p000.InterfaceC3785
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1896(C2612 c2612) {
        m5874(c2612, null);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m5865() {
        LinkedList linkedList = this.f10703;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC3092 abstractC3092 = (AbstractC3092) arrayList.get(i);
            if (!this.f10702.m1828()) {
                return;
            }
            if (m5867(abstractC3092)) {
                linkedList.remove(abstractC3092);
            }
        }
    }

    @Override // p000.InterfaceC1895
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1897(int i) {
        Looper looperMyLooper = Looper.myLooper();
        HandlerC0645 handlerC0645 = this.f10692.f13634;
        if (looperMyLooper == handlerC0645.getLooper()) {
            m5869(i);
        } else {
            handlerC0645.post(new RunnableC4527(this, i));
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C2274 m5866(C2274[] c2274Arr) {
        if (c2274Arr == null || c2274Arr.length == 0) {
            return null;
        }
        C2274[] c2274ArrM1834 = this.f10702.m1834();
        if (c2274ArrM1834 == null) {
            c2274ArrM1834 = new C2274[0];
        }
        C4461 c4461 = new C4461(c2274ArrM1834.length);
        for (C2274 c2274 : c2274ArrM1834) {
            c4461.put(c2274.f7553, Long.valueOf(c2274.m4321()));
        }
        for (C2274 c2275 : c2274Arr) {
            Long l = (Long) c4461.get(c2275.f7553);
            if (l == null || l.longValue() < c2275.m4321()) {
                return c2275;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m5867(AbstractC3092 abstractC3092) {
        if (abstractC3092 == null) {
            C2346 c2346 = this.f10695;
            InterfaceC0858 interfaceC0858 = this.f10702;
            abstractC3092.mo3477(c2346, interfaceC0858.mo1833());
            try {
                abstractC3092.mo3476(this);
                return true;
            } catch (DeadObjectException unused) {
                mo1897(1);
                interfaceC0858.m1829("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        C2274 c2274M5866 = m5866(abstractC3092.mo3478(this));
        if (c2274M5866 == null) {
            C2346 c2347 = this.f10695;
            InterfaceC0858 interfaceC0859 = this.f10702;
            abstractC3092.mo3477(c2347, interfaceC0859.mo1833());
            try {
                abstractC3092.mo3476(this);
                return true;
            } catch (DeadObjectException unused2) {
                mo1897(1);
                interfaceC0859.m1829("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f10702.getClass().getName() + " could not execute call because it requires feature (" + c2274M5866.f7553 + ", " + c2274M5866.m4321() + ").");
        if (!this.f10692.f13639 || !abstractC3092.mo3480(this)) {
            abstractC3092.mo3481(new C2984(c2274M5866));
            return true;
        }
        C1417 c1417 = new C1417(this.f10694, c2274M5866);
        int iIndexOf = this.f10699.indexOf(c1417);
        ArrayList arrayList = this.f10699;
        if (iIndexOf >= 0) {
            C1417 c1418 = (C1417) arrayList.get(iIndexOf);
            this.f10692.f13634.removeMessages(15, c1418);
            HandlerC0645 handlerC0645 = this.f10692.f13634;
            handlerC0645.sendMessageDelayed(Message.obtain(handlerC0645, 15, c1418), 5000L);
            return false;
        }
        arrayList.add(c1417);
        HandlerC0645 handlerC0646 = this.f10692.f13634;
        handlerC0646.sendMessageDelayed(Message.obtain(handlerC0646, 15, c1417), 5000L);
        HandlerC0645 handlerC0647 = this.f10692.f13634;
        handlerC0647.sendMessageDelayed(Message.obtain(handlerC0647, 16, c1417), 120000L);
        C2612 c2612 = new C2612(2, null, null);
        if (m5868(c2612)) {
            return false;
        }
        this.f10692.m7274(c2612, this.f10700);
        return false;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final boolean m5868(C2612 c2612) {
        synchronized (C4085.f13622) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m5869(int i) {
        C4085 c4085 = this.f10692;
        HandlerC0645 handlerC0645 = c4085.f13634;
        AbstractC0487.m1077(c4085.f13634);
        this.f10697 = null;
        this.f10698 = true;
        String strM1831 = this.f10702.m1831();
        C2346 c2346 = this.f10695;
        c2346.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strM1831 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strM1831);
        }
        c2346.m4395(true, new Status(20, sb.toString(), null, null));
        C5001 c5001 = this.f10694;
        handlerC0645.sendMessageDelayed(Message.obtain(handlerC0645, 9, c5001), 5000L);
        handlerC0645.sendMessageDelayed(Message.obtain(handlerC0645, 11, c5001), 120000L);
        ((SparseIntArray) c4085.f13638.f7924).clear();
        Iterator it = this.f10696.values().iterator();
        while (it.hasNext()) {
            ((C5742) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m5870() {
        InterfaceC0858 interfaceC0858 = this.f10702;
        C4085 c4085 = this.f10692;
        AbstractC0487.m1077(c4085.f13634);
        this.f10697 = null;
        m5861(C2612.f8709);
        HandlerC0645 handlerC0645 = c4085.f13634;
        if (this.f10698) {
            C5001 c5001 = this.f10694;
            handlerC0645.removeMessages(11, c5001);
            handlerC0645.removeMessages(9, c5001);
            this.f10698 = false;
        }
        Iterator it = this.f10696.values().iterator();
        while (it.hasNext()) {
            C5742 c5742 = (C5742) it.next();
            if (m5866((C2274[]) c5742.f18939.f4835) != null) {
                it.remove();
            } else {
                try {
                    C1405 c1405 = c5742.f18939;
                    new C3580();
                    C5460 c5460 = (C5460) ((C4752) c1405.f4838).f15686;
                    c5460.getClass();
                    C3663 c3663 = (C3663) ((C5390) interfaceC0858).m7333();
                    BinderC0222 binderC0222 = new BinderC0222((C1543) c5460.f18001, (C1795) c5460.f18000);
                    String str = (String) c5460.f17999;
                    Parcel parcelM7504 = c3663.m7504();
                    parcelM7504.writeString(str);
                    AbstractC5564.m9344(parcelM7504, binderC0222);
                    c3663.m7505(parcelM7504, 28);
                } catch (DeadObjectException unused) {
                    mo1897(3);
                    interfaceC0858.m1829("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m5865();
        m5871();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m5871() {
        C4085 c4085 = this.f10692;
        HandlerC0645 handlerC0645 = c4085.f13634;
        C5001 c5001 = this.f10694;
        handlerC0645.removeMessages(12, c5001);
        handlerC0645.sendMessageDelayed(handlerC0645.obtainMessage(12, c5001), c4085.f13631);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m5872(Status status, Exception exc, boolean z) {
        AbstractC0487.m1077(this.f10692.f13634);
        if ((status == null) == (exc == null)) {
            C1078.m2272("Status XOR exception should be null");
            return;
        }
        Iterator it = this.f10703.iterator();
        while (it.hasNext()) {
            AbstractC3092 abstractC3092 = (AbstractC3092) it.next();
            if (!z || abstractC3092.f10374 == 2) {
                if (status != null) {
                    abstractC3092.mo3475(status);
                } else {
                    abstractC3092.mo3481(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m5873() {
        C4085 c4085 = this.f10692;
        AbstractC0487.m1077(c4085.f13634);
        InterfaceC0858 interfaceC0858 = this.f10702;
        if (interfaceC0858.m1828() || interfaceC0858.m1825()) {
            return;
        }
        try {
            C2391 c2391 = c4085.f13638;
            Context context = c4085.f13627;
            SparseIntArray sparseIntArray = (SparseIntArray) c2391.f7924;
            AbstractC0487.m1047(context);
            int iM1824 = interfaceC0858.m1824();
            int iM1308 = ((SparseIntArray) c2391.f7924).get(iM1824, -1);
            if (iM1308 == -1) {
                iM1308 = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iM1308 = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iM1824 && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iM1308 == -1) {
                    iM1308 = C1991.f6570.m1308(context, iM1824);
                }
                sparseIntArray.put(iM1824, iM1308);
            }
            if (iM1308 != 0) {
                C2612 c2612 = new C2612(iM1308, null, null);
                Log.w("GoogleApiManager", "The service for " + interfaceC0858.getClass().getName() + " is not available: " + c2612.toString());
                m5874(c2612, null);
                return;
            }
            C2566 c2566 = new C2566(c4085, interfaceC0858, this.f10694);
            if (interfaceC0858.mo1833()) {
                BinderC0913 binderC0913 = this.f10701;
                AbstractC0487.m1047(binderC0913);
                Handler handler = binderC0913.f3279;
                C2813 c2813 = binderC0913.f3281;
                C5719 c5719 = binderC0913.f3282;
                if (c5719 != null) {
                    c5719.m7345();
                }
                c2813.f9392 = Integer.valueOf(System.identityHashCode(binderC0913));
                binderC0913.f3282 = (C5719) binderC0913.f3280.mo4390(binderC0913.f3284, handler.getLooper(), c2813, (C2478) c2813.f9391, binderC0913, binderC0913);
                binderC0913.f3283 = c2566;
                Set set = binderC0913.f3278;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableC3365(15, binderC0913));
                } else {
                    C5719 c57110 = binderC0913.f3282;
                    c57110.getClass();
                    c57110.m7343(new C5086(c57110));
                }
            }
            try {
                interfaceC0858.m1832(c2566);
            } catch (SecurityException e) {
                m5874(new C2612(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            m5874(new C2612(10, null, null), e2);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m5874(C2612 c2612, RuntimeException runtimeException) {
        C5719 c5719;
        AbstractC0487.m1077(this.f10692.f13634);
        BinderC0913 binderC0913 = this.f10701;
        if (binderC0913 != null && (c5719 = binderC0913.f3282) != null) {
            c5719.m7345();
        }
        AbstractC0487.m1077(this.f10692.f13634);
        this.f10697 = null;
        ((SparseIntArray) this.f10692.f13638.f7924).clear();
        m5861(c2612);
        if ((this.f10702 instanceof C5340) && c2612.f8713 != 24) {
            C4085 c4085 = this.f10692;
            c4085.f13629 = true;
            HandlerC0645 handlerC0645 = c4085.f13634;
            handlerC0645.sendMessageDelayed(handlerC0645.obtainMessage(19), 300000L);
        }
        if (c2612.f8713 == 4) {
            m5862(C4085.f13624);
            return;
        }
        if (this.f10703.isEmpty()) {
            this.f10697 = c2612;
            return;
        }
        C4085 c4086 = this.f10692;
        if (runtimeException != null) {
            AbstractC0487.m1077(c4086.f13634);
            m5872(null, runtimeException, false);
            return;
        }
        boolean z = c4086.f13639;
        C5001 c5001 = this.f10694;
        if (!z) {
            m5862(C4085.m7271(c5001, c2612));
            return;
        }
        m5872(C4085.m7271(c5001, c2612), null, true);
        if (this.f10703.isEmpty() || m5868(c2612) || this.f10692.m7274(c2612, this.f10700)) {
            return;
        }
        if (c2612.f8713 == 18) {
            this.f10698 = true;
        }
        if (!this.f10698) {
            m5862(C4085.m7271(this.f10694, c2612));
            return;
        }
        C4085 c4087 = this.f10692;
        C5001 c5002 = this.f10694;
        HandlerC0645 handlerC0646 = c4087.f13634;
        handlerC0646.sendMessageDelayed(Message.obtain(handlerC0646, 9, c5002), 5000L);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m5875(AbstractC3092 abstractC3092) {
        AbstractC0487.m1077(this.f10692.f13634);
        boolean zM1828 = this.f10702.m1828();
        LinkedList linkedList = this.f10703;
        if (zM1828) {
            if (m5867(abstractC3092)) {
                m5871();
                return;
            } else {
                linkedList.add(abstractC3092);
                return;
            }
        }
        linkedList.add(abstractC3092);
        C2612 c2612 = this.f10697;
        if (c2612 == null || c2612.f8713 == 0 || c2612.f8711 == null) {
            m5873();
        } else {
            m5874(c2612, null);
        }
    }
}
