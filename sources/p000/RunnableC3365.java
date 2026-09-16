package p000;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۦؖؖؔٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3365 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f11241;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11242;

    public RunnableC3365(AbstractDialogInterfaceOnCancelListenerC1687 abstractDialogInterfaceOnCancelListenerC1687, C0322 c0322) {
        this.f11242 = 16;
        this.f11241 = c0322;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0255  */
    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        Object obj;
        AbstractC2797 abstractC2797M4987;
        long jNanoTime;
        C4718 c4718;
        int i = 3;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        switch (this.f11242) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) this.f11241;
                viewTreeObserverOnGlobalLayoutListenerC0850.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0850.f3108;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                viewTreeObserverOnGlobalLayoutListenerC0850.m1791(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, viewTreeObserverOnGlobalLayoutListenerC0850.f3062, false);
                return;
            case 1:
                C2139 c2139 = (C2139) this.f11241;
                c2139.setText(c2139.getText());
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ViewOnTouchListenerC4081 viewOnTouchListenerC4081 = (ViewOnTouchListenerC4081) this.f11241;
                C1391 c1391 = viewOnTouchListenerC4081.f13609;
                C2280 c2280 = viewOnTouchListenerC4081.f13620;
                if (viewOnTouchListenerC4081.f13614) {
                    if (viewOnTouchListenerC4081.f13606) {
                        viewOnTouchListenerC4081.f13606 = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c2280.f7574 = jCurrentAnimationTimeMillis;
                        c2280.f7581 = -1L;
                        c2280.f7575 = jCurrentAnimationTimeMillis;
                        c2280.f7577 = 0.5f;
                    }
                    if ((c2280.f7581 > 0 && AnimationUtils.currentAnimationTimeMillis() > c2280.f7581 + ((long) c2280.f7580)) || !viewOnTouchListenerC4081.m7267()) {
                        viewOnTouchListenerC4081.f13614 = false;
                        return;
                    }
                    if (viewOnTouchListenerC4081.f13605) {
                        viewOnTouchListenerC4081.f13605 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c1391.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c2280.f7575 == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM4340 = c2280.m4340(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c2280.f7575;
                    c2280.f7575 = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC4081.f13617.scrollListBy((int) (j * ((fM4340 * 4.0f) + ((-4.0f) * fM4340 * fM4340)) * c2280.f7579));
                    WeakHashMap weakHashMap = AbstractC3608.f12013;
                    c1391.postOnAnimation(this);
                    return;
                }
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((C4228) this.f11241).f14025;
                int i5 = bottomSheetBehavior.f310;
                if (i5 != 2 || i5 == 0) {
                    return;
                }
                bottomSheetBehavior.f310 = 0;
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                DialogInterfaceOnCancelListenerC2120 dialogInterfaceOnCancelListenerC2120 = (DialogInterfaceOnCancelListenerC2120) this.f11241;
                dialogInterfaceOnCancelListenerC2120.f6970.onDismiss(dialogInterfaceOnCancelListenerC2120.f6968);
                return;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C1391 c1392 = (C1391) this.f11241;
                c1392.f4751 = null;
                c1392.drawableStateChanged();
                return;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = (AbstractComponentCallbacksC0308) this.f11241;
                if (abstractComponentCallbacksC0308.f1115 != null) {
                    abstractComponentCallbacksC0308.m642();
                    return;
                }
                return;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C2790) this.f11241).m5265(true);
                return;
            case 8:
                synchronized (((C3543) this.f11241).f11767) {
                    obj = ((C3543) this.f11241).f11764;
                    ((C3543) this.f11241).f11764 = C3543.f11761;
                    break;
                }
                C3543 c3543 = (C3543) this.f11241;
                C3543.m6343("setValue");
                c3543.f11771++;
                c3543.f11763 = obj;
                c3543.m6344(null);
                return;
            case 9:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f11241;
                if (searchView$SearchAutoComplete.f115) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f115 = false;
                    return;
                }
                return;
            case 10:
                C2139 c21310 = (C2139) ((C2346) this.f11241).f7785;
                c21310.setText(c21310.getText());
                return;
            case 11:
                break;
            case 12:
                ActionMenuView actionMenuView = ((Toolbar) this.f11241).f159;
                if (actionMenuView == null || (c4718 = actionMenuView.f96) == null) {
                    return;
                }
                c4718.m8053();
                return;
            case 13:
                ((C3184) this.f11241).m5870();
                return;
            case 14:
                InterfaceC0858 interfaceC0858 = ((C3184) ((C2391) this.f11241).f7924).f10702;
                interfaceC0858.m1829(interfaceC0858.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((BinderC0913) this.f11241).f3283.m4839(new C2612(4, null, null));
                return;
            case 16:
                throw null;
            case 17:
                C1159 c1159 = (C1159) this.f11241;
                try {
                    SQLiteDatabase sQLiteDatabaseM2463 = c1159.m2463();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseM2463.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e) {
                    C3610 c3610 = ((C5371) c1159.f18660).f17717;
                    C5371.m9020(c3610);
                    c3610.f12020.m9430(e, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 18:
                C3517 c3517 = (C3517) this.f11241;
                synchronized (c3517.f11644) {
                    ((InterfaceC2342) c3517.f11645).mo2242();
                    break;
                }
                return;
            case 19:
                ((C2841) this.f11241).f9489.m8539();
                return;
            case 20:
                C5695 c5695 = ((ServiceConnectionC0769) this.f11241).f2785;
                c5695.m9514(new ComponentName(((C5371) c5695.f18660).f17739, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 21:
                C5695 c5696 = ((ServiceConnectionC0769) ((RunnableC5413) this.f11241).f17867).f2785;
                C3644 c3644 = ((C5371) c5696.f18660).f17733;
                C5371.m9020(c3644);
                c3644.m6515(new RunnableC3936(c5696, i3));
                return;
            case 22:
                RunnableC0766 runnableC0766 = (RunnableC0766) this.f11241;
                C4423 c4423 = (C4423) runnableC0766.f2780.f16142;
                c4423.mo6517();
                C5371 c5371 = (C5371) c4423.f18660;
                C3610 c3611 = c5371.f17717;
                Context context = c5371.f17739;
                C5371.m9020(c3611);
                c3611.f12015.m9432("Application going to the background");
                C4474 c4474 = c5371.f17713;
                C5371.m9021(c4474);
                c4474.f14767.m8174(true);
                c4423.mo6517();
                c4423.f14592 = true;
                C0515 c0515 = c5371.f17715;
                if (!c0515.m1161()) {
                    long j2 = runnableC0766.f2781;
                    C0616 c0616 = c4423.f14593;
                    c0616.m1382(false, false, j2);
                    c0616.f2298.m2198();
                }
                long j3 = runnableC0766.f2782;
                C5371.m9020(c3611);
                c3611.f12016.m9430(Long.valueOf(j3), "Application backgrounded at: timestamp_millis");
                C5235 c5235 = c5371.f17709;
                C5371.m9023(c5235);
                c5235.mo6517();
                C5371 c5372 = (C5371) c5235.f18660;
                c5235.m7643();
                C5695 c5695M9028 = c5372.m9028();
                c5695M9028.mo6517();
                c5695M9028.m7643();
                if (c5695M9028.m9518()) {
                    C1512 c1512 = ((C5371) c5695M9028.f18660).f17721;
                    C5371.m9021(c1512);
                    if (c1512.m3242() >= 242600) {
                        C5695 c5695M9029 = c5372.m9028();
                        c5695M9029.mo6517();
                        c5695M9029.m7643();
                        c5695M9029.m9509(new RunnableC4292(c5695M9029, c5695M9029.m9517(true), i2));
                    }
                } else {
                    C5695 c5695M90210 = c5372.m9028();
                    c5695M90210.mo6517();
                    c5695M90210.m7643();
                    c5695M90210.m9509(new RunnableC4292(c5695M90210, c5695M90210.m9517(true), i2));
                }
                if (c0515.m1162(null, AbstractC4936.f16257)) {
                    C1512 c1513 = c5371.f17721;
                    C5371.m9021(c1513);
                    long jM1159 = c1513.m3206(context.getPackageName(), c0515.f1840) ? 1000L : c0515.m1159(context.getPackageName(), AbstractC4936.f16277);
                    C5371.m9020(c3611);
                    c3611.f12023.m9430(Long.valueOf(jM1159), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    C5371.m9022(c5371.f17724);
                    c5371.f17724.m8029(jM1159);
                    return;
                }
                return;
            case 23:
                C5034 c5034 = (C5034) this.f11241;
                c5034.mo2406().mo6517();
                c5034.f16675 = new C3385(c5034);
                C1159 c11510 = new C1159(c5034);
                c11510.m4636();
                c5034.f16670 = c11510;
                C3040 c3040 = c5034.f16698;
                C0515 c0515M8519 = c5034.m8519();
                AbstractC0487.m1047(c3040);
                c0515M8519.f1841 = c3040;
                C5272 c5272 = new C5272(c5034);
                c5272.m4636();
                c5034.f16678 = c5272;
                C1419 c1419 = new C1419(c5034);
                c1419.m4636();
                c5034.f16673 = c1419;
                C1518 c1518 = new C1518(c5034, i4);
                c1518.m4636();
                c5034.f16694 = c1518;
                C1564 c1564 = new C1564(c5034);
                c1564.m4636();
                c5034.f16669 = c1564;
                c5034.f16671 = new C2841(c5034);
                if (c5034.f16679 != c5034.f16688) {
                    c5034.mo2404().f12020.m9434(Integer.valueOf(c5034.f16679), Integer.valueOf(c5034.f16688), "Not all upload components initialized");
                }
                c5034.f16663.set(true);
                c5034.mo2404().f12023.m9432("UploadController is now fully initialized");
                c5034.mo2406().mo6517();
                C1159 c11511 = c5034.f16670;
                C5034.m8484(c11511);
                c11511.m2418();
                C1159 c11512 = c5034.f16670;
                C5034.m8484(c11512);
                c11512.mo6517();
                c11512.m4637();
                if (c11512.m2469()) {
                    C2462 c2462 = AbstractC4936.f16279;
                    if (((Long) c2462.m4592(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseM2464 = c11512.m2463();
                        C5371 c5373 = (C5371) c11512.f18660;
                        c5373.f17719.getClass();
                        int iDelete = sQLiteDatabaseM2464.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(c2462.m4592(null))});
                        if (iDelete > 0) {
                            C3610 c3612 = c5373.f17717;
                            C5371.m9020(c3612);
                            c3612.f12023.m9430(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (c5034.f16678.f17376.m7371() == 0) {
                    C4173 c4173 = c5034.f16678.f17376;
                    c5034.mo2403().getClass();
                    c4173.m7370(System.currentTimeMillis());
                }
                c5034.m8539();
                return;
            case 24:
                throw new RuntimeException(((ExecutionException) this.f11241).getCause());
            case 25:
                try {
                    AbstractC2552.m4816((InterfaceFutureC4378) this.f11241);
                    return;
                } catch (ExecutionException e2) {
                    AbstractC0949.m1944().post(new RunnableC3365(24, e2));
                    return;
                }
            case 26:
                try {
                    AbstractC2552.m4816((AbstractC5352) this.f11241);
                    return;
                } catch (Exception e3) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e3);
                    return;
                }
            case 27:
                try {
                    AbstractC2552.m4816((AbstractC4857) this.f11241);
                    return;
                } catch (Exception e4) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e4);
                        return;
                    }
                    return;
                }
            case 28:
                C5371 c5374 = (C5371) ((C0775) this.f11241).f2805;
                C5371.m9022(c5374.f17724);
                c5374.f17724.m8029(((Long) AbstractC4936.f16332.m4592(null)).longValue());
                return;
            default:
                C5371 c5375 = (C5371) this.f11241;
                C1512 c1514 = c5375.f17721;
                C5235 c5236 = c5375.f17709;
                C5371.m9021(c1514);
                c1514.mo6517();
                if (c1514.m3241() != 1) {
                    C3610 c3613 = c5375.f17717;
                    C5371.m9020(c3613);
                    c3613.f12022.m9432("registerTrigger called but app not eligible");
                    return;
                }
                C5371.m9023(c5236);
                c5236.mo6517();
                C0826 c0826 = c5236.f17268;
                if (c0826 != null) {
                    c0826.m2198();
                }
                C5371.m9023(c5236);
                new Thread(new RunnableC3148(c5236, i)).start();
                return;
        }
        while (true) {
            C2680 c2680 = (C2680) this.f11241;
            synchronized (c2680) {
                abstractC2797M4987 = c2680.m4987();
            }
            if (abstractC2797M4987 == null) {
                return;
            }
            C2324 c2324 = abstractC2797M4987.f9350;
            C2680 c2681 = (C2680) this.f11241;
            boolean zIsLoggable = C2680.f8891.isLoggable(Level.FINE);
            if (zIsLoggable) {
                C2680 c2682 = c2324.f7689;
                jNanoTime = System.nanoTime();
                AbstractC3801.m6744(abstractC2797M4987, c2324, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                c2681.m4986(abstractC2797M4987);
                if (zIsLoggable) {
                    C2680 c2683 = c2324.f7689;
                    AbstractC3801.m6744(abstractC2797M4987, c2324, "finished run in ".concat(AbstractC3801.m6786(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) c2681.f8896.f10451).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        C2680 c2684 = c2324.f7689;
                        AbstractC3801.m6744(abstractC2797M4987, c2324, "failed a run in ".concat(AbstractC3801.m6786(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ RunnableC3365(int i, Object obj) {
        this.f11242 = i;
        this.f11241 = obj;
    }

    public RunnableC3365(C2841 c2841, boolean z) {
        this.f11242 = 19;
        this.f11241 = c2841;
    }

    public RunnableC3365(C5034 c5034, C0272 c0272) {
        this.f11242 = 23;
        this.f11241 = c5034;
    }
}
