package com.google.android.datatransport.cct;

import android.content.Context;
import p000.AbstractC4731;
import p000.C2738;
import p000.C5782;
import p000.InterfaceC3586;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC3586 create(AbstractC4731 abstractC4731) {
        Context context = ((C2738) abstractC4731).f9065;
        C2738 c2738 = (C2738) abstractC4731;
        return new C5782(context, c2738.f9064, c2738.f9063);
    }
}
