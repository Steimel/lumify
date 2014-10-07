package io.lumify.web.clientapi.model;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class VertexSearchResponse {
    private List<Vertex> vertices = new ArrayList<Vertex>();
    private Integer nextOffset = null;
    private Long retrievalTime = null;
    private Long totalTime = null;
    private Long totalHits = null;
    private Long searchTime = null;

    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public Long getRetrievalTime() {
        return retrievalTime;
    }

    public void setRetrievalTime(Long retrievalTime) {
        this.retrievalTime = retrievalTime;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    public Long getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(Long totalHits) {
        this.totalHits = totalHits;
    }

    public Long getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(Long searchTime) {
        this.searchTime = searchTime;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    @Override
    public String toString() {
        return "VertexSearchResponse{" +
                "vertices=" + Joiner.on(',').join(vertices) +
                ", nextOffset=" + nextOffset +
                ", retrievalTime=" + retrievalTime +
                ", totalTime=" + totalTime +
                ", totalHits=" + totalHits +
                ", searchTime=" + searchTime +
                '}';
    }
}
