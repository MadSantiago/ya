package p000;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: renamed from: ۥؘِؖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0561 {

    /* JADX INFO: renamed from: ۥۣ */
    public final MeasurementManager f2004;

    public AbstractC0561(MeasurementManager measurementManager) {
        this.f2004 = measurementManager;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static Object m1246(AbstractC0561 abstractC0561, AbstractC5250 abstractC5250, InterfaceC0443<? super C2358> interfaceC0443) {
        new C2600(1, AbstractC2776.m5232(interfaceC0443)).m4913();
        MeasurementManager measurementManager = abstractC0561.f2004;
        throw null;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static Object m1247(AbstractC0561 abstractC0561, Uri uri, InputEvent inputEvent, InterfaceC0443<? super C2358> interfaceC0443) {
        C2600 c2600 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
        c2600.m4913();
        abstractC0561.f2004.registerSource(uri, inputEvent, new ExecutorC4322(1), new C1213(c2600));
        Object objM4909 = c2600.m4909();
        return objM4909 == EnumC2282.f7590 ? objM4909 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static Object m1248(AbstractC0561 abstractC0561, InterfaceC0443<? super Integer> interfaceC0443) {
        C2600 c2600 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
        c2600.m4913();
        abstractC0561.f2004.getMeasurementApiStatus(new ExecutorC4322(1), new C1213(c2600));
        return c2600.m4909();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static Object m1249(AbstractC0561 abstractC0561, AbstractC3748 abstractC3748, InterfaceC0443<? super C2358> interfaceC0443) {
        new C2600(1, AbstractC2776.m5232(interfaceC0443)).m4913();
        MeasurementManager measurementManager = abstractC0561.f2004;
        throw null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static Object m1250(AbstractC0561 abstractC0561, Uri uri, InterfaceC0443<? super C2358> interfaceC0443) {
        C2600 c2600 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
        c2600.m4913();
        abstractC0561.f2004.registerTrigger(uri, new ExecutorC4322(1), new C1213(c2600));
        Object objM4909 = c2600.m4909();
        return objM4909 == EnumC2282.f7590 ? objM4909 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static Object m1251(AbstractC0561 abstractC0561, AbstractC1073 abstractC1073, InterfaceC0443<? super C2358> interfaceC0443) {
        Object objM7173 = AbstractC4009.m7173(new C5558(abstractC0561, null, 3), interfaceC0443);
        return objM7173 == EnumC2282.f7590 ? objM7173 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static Object m1252(AbstractC0561 abstractC0561, AbstractC5154 abstractC5154, InterfaceC0443<? super C2358> interfaceC0443) {
        new C2600(1, AbstractC2776.m5232(interfaceC0443)).m4913();
        MeasurementManager measurementManager = abstractC0561.f2004;
        throw null;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public Object m1253(InterfaceC0443<? super Integer> interfaceC0443) {
        return m1248(this, interfaceC0443);
    }

    /* JADX INFO: renamed from: ۥُ */
    public Object m1254(AbstractC1073 abstractC1073, InterfaceC0443<? super C2358> interfaceC0443) {
        return m1251(this, abstractC1073, interfaceC0443);
    }

    /* JADX INFO: renamed from: ۥّ */
    public Object m1255(Uri uri, InputEvent inputEvent, InterfaceC0443<? super C2358> interfaceC0443) {
        return m1247(this, uri, inputEvent, interfaceC0443);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public Object m1256(AbstractC5250 abstractC5250, InterfaceC0443<? super C2358> interfaceC0443) {
        return m1246(this, abstractC5250, interfaceC0443);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public Object m1257(AbstractC5154 abstractC5154, InterfaceC0443<? super C2358> interfaceC0443) {
        return m1252(this, abstractC5154, interfaceC0443);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public Object m1258(Uri uri, InterfaceC0443<? super C2358> interfaceC0443) {
        return m1250(this, uri, interfaceC0443);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public Object m1259(AbstractC3748 abstractC3748, InterfaceC0443<? super C2358> interfaceC0443) {
        return m1249(this, abstractC3748, interfaceC0443);
    }
}
