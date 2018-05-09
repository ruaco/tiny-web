package com.ruaco.tinyweb;


import com.ruaco.tinyweb.exception.RenderingException;

import java.util.List;
import java.util.Map;

public class StrategyView implements View {

    private RenderingStrategy viewRender;

    public StrategyView(RenderingStrategy viewRender) {
        this.viewRender = viewRender;
    }

    @Override
    public String render(Map<String, List<String>> model) {
        try {
            return viewRender.renderView(model);
        }catch (Exception e) {
            throw new RenderingException(e);
        }
    }
}