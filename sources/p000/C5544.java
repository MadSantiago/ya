package p000;

import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦۢؕۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5544 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f18314;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f18315;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f18316;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5544(int i, Object obj, Object obj2) {
        super(1);
        this.f18316 = i;
        this.f18315 = obj;
        this.f18314 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ۥَؕؒٝ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ۦۚؒٞۤ] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        InputConnectionC4504 inputConnectionC4504;
        C2358 c2358;
        int i = 3;
        ?? r3 = 0;
        int i2 = 0;
        switch (this.f18316) {
            case 0:
                return new C4785((C2734) this.f18315, new C5285(i2, (C0717) this.f18314));
            case 1:
                C4785 c4785 = (C4785) this.f18315;
                synchronized (c4785.f15782) {
                    try {
                        c4785.f15783 = true;
                        C0863 c0863 = c4785.f15786;
                        Object[] objArr = c0863.f3182;
                        int i3 = c0863.f3180;
                        while (i2 < i3) {
                            InputConnectionC2290 inputConnectionC2290 = (InputConnectionC2290) ((C5756) objArr[i2]).get();
                            if (inputConnectionC2290 != null && (inputConnectionC4504 = inputConnectionC2290.f7610) != null) {
                                inputConnectionC4504.closeConnection();
                                inputConnectionC2290.f7610 = null;
                            }
                            i2++;
                        }
                        c4785.f15786.m1851();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C1568 c1568 = ((C0717) this.f18314).f2624;
                c1568.f5284.set(null);
                c1568.f5285.mo3444();
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C2453 c2453 = (C2453) this.f18315;
                c2453.setPositionProvider((InterfaceC4396) this.f18314);
                c2453.m4578();
                return new C3279(0);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5418 c5418 = (C5418) this.f18315;
                ChoreographerFrameCallbackC4420 choreographerFrameCallbackC4420 = (ChoreographerFrameCallbackC4420) this.f18314;
                synchronized (c5418.f17885) {
                    c5418.f17886.remove(choreographerFrameCallbackC4420);
                }
                return C2358.f7817;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((Choreographer) ((C2404) this.f18315).f8011).removeFrameCallback((ChoreographerFrameCallbackC4420) this.f18314);
                return C2358.f7817;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C0605) this.f18315).m1333(((InterfaceC0705) obj).mo1571((InterfaceC0705) this.f18314));
                return C2358.f7817;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC1842.m3621((AbstractC1842) obj, (AbstractC0275) this.f18315, ((C4201) this.f18314).f13959);
                return C2358.f7817;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                Throwable th2 = (Throwable) obj;
                C4206 c4206 = (C4206) this.f18315;
                if (th2 == null) {
                    c4206.m7429(((C2926) this.f18314).m874());
                } else if (th2 instanceof CancellationException) {
                    c4206.f13968 = true;
                    C4995 c4995 = c4206.f13966;
                    if (c4995 != null && c4995.f16533.cancel(true)) {
                        c4206.f13967 = null;
                        c4206.f13966 = null;
                        c4206.f13965 = null;
                    }
                } else {
                    c4206.m7428(th2);
                }
                return C2358.f7817;
            case 8:
                C2358 c2359 = C2358.f7817;
                if (AbstractC3831.m6874((String) obj, ((File) this.f18315).getName())) {
                    C3002 c3002 = (C3002) this.f18314;
                    Object objMo5597 = c3002.f10101.mo5597(c2359);
                    if (objMo5597 instanceof C1259) {
                        Object obj2 = ((C2368) AbstractC5537.m9243(C4794.f15814, new C0023(c3002, r3, 13))).f7850;
                    }
                }
                return c2359;
            case 9:
                MotionEvent motionEvent = (MotionEvent) obj;
                C2317 c2317 = (C2317) this.f18314;
                if (motionEvent.getActionMasked() == 0) {
                    C0376 c0376 = (C0376) this.f18315;
                    C5157 c5157 = c2317.f7659;
                    c0376.f1401 = ((Boolean) (c5157 != null ? c5157 : null).mo211(motionEvent)).booleanValue() ? 2 : 3;
                } else {
                    C5157 c5158 = c2317.f7659;
                    (c5158 != null ? c5158 : 0).mo211(motionEvent);
                }
                return C2358.f7817;
            case 10:
                C2358 c23510 = C2358.f7817;
                Throwable th3 = (Throwable) obj;
                ((C2932) this.f18315).mo211(th3);
                C5559 c5559 = (C5559) ((C1489) this.f18314).f5058;
                c5559.m9319(th3, false);
                do {
                    Object objM4445 = C2368.m4445(c5559.mo5595());
                    if (objM4445 != null) {
                        ((C1429) objM4445).f4905.m854(new C5036(th3 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th3, false));
                        c2358 = c23510;
                    } else {
                        c2358 = null;
                    }
                } while (c2358 != null);
                return c23510;
            case 11:
                AbstractC1842.m3621((AbstractC1842) obj, (AbstractC0275) this.f18315, ((C2096) this.f18314).f6906);
                return C2358.f7817;
            default:
                C5686 c5686 = (C5686) obj;
                C0857 c0857 = (C0857) this.f18314;
                C2074 c2074 = (C2074) this.f18315;
                if (!c2074.f6845) {
                    InterfaceC4507 interfaceC4507 = c5686.f18690;
                    View view = c5686.f18700;
                    AbstractC1434 abstractC1434Mo110 = interfaceC4507.mo110();
                    c2074.f6844 = c0857;
                    if (c2074.f6846 == null) {
                        if (AbstractC3831.m6874(Looper.myLooper(), view.getHandler().getLooper())) {
                            c2074.f6846 = abstractC1434Mo110;
                            abstractC1434Mo110.mo2388(c2074);
                        } else {
                            view.post(new RunnableC5689(24, c2074, abstractC1434Mo110));
                        }
                    } else if (abstractC1434Mo110.mo2387().m976(EnumC0458.f1653)) {
                        c2074.f6847.m3809(new C0857(-1723985096, new C3560(c2074, c5686, c0857, i), true));
                    }
                }
                return C2358.f7817;
        }
    }
}
